package compiler.nelang;

import compiler.nelang.antlr.NelangBaseVisitor;
import compiler.nelang.antlr.NelangParser;
import java.io.InputStream;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("CheckReturnValue")
public class EvalVisitor extends NelangBaseVisitor {

    ParseTree tree;
    Stack<VisitorContext> stacktrace;

    // Memory
    Label focusedLabel = null;
    Label currentLabel = null;
    Map<String, Variable> expects = new HashMap<String, Variable>();
    Map<String, Variable> exports = new HashMap<String, Variable>();

    public EvalVisitor(ParseTree tree) {
        this("nlg", tree, new Stack<VisitorContext>());
    }

    public EvalVisitor(String label, ParseTree tree, Stack<VisitorContext> stacktrace) {
        this.focusedLabel = new Label(label);
        this.tree = tree;
        this.stacktrace = stacktrace;
        try {
            VisitorContext pastVisitor = stacktrace.peek();
            Map<String, Variable> pastExports = pastVisitor.visitor().exports();
            for (Variable variable : pastExports.values()) {
                // Add the variable to the focused label to be added to the current label after he is visited
                this.focusedLabel.addVariable(variable);
                this.expects.put(variable.name(), variable);
            }
        } catch (EmptyStackException e) {
            // Do nothing
        }
    }

    public Label currentLabel() {
        return this.currentLabel;
    }

    public Map<String, Variable> exports() {
        return this.exports;
    }

    public Object visitLabel(NelangParser.LabelContext ctx) {
        Label label = (Label) visit(ctx.initLabel());
        if (!label.name().equals(this.focusedLabel.name())) {
            return null;
        }
        return visitChildren(ctx);
    }

    public Label visitInitLabel(NelangParser.InitLabelContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Label label = new Label(id);
        this.currentLabel = label;
        // Add each variable from the focused label to the current label
        // It's run only when the focused label is the current label, defined on visitLabel method
        for (Variable variable : this.focusedLabel.variables().values()) {
            this.currentLabel.addVariable(variable);
        }
        return label;
    }

    public Map<String, Variable> visitDeclaration(NelangParser.DeclarationContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            Variable variable = new Variable(id);
            this.currentLabel.addVariable(variable);
        }
        return this.currentLabel.variables();
    }

    public Map<String, Variable> visitExpect(NelangParser.ExpectContext ctx) throws NelangException {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        Map<String, Variable> variables = new HashMap<String, Variable>();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            // The expected variable has added to the current label on the constructor
            if (!this.expects.containsKey(id)) {
                this.reportException("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                        + " Variable " + id + " not exported in the label " + this.currentLabel.name(), ctx);
            }
            variables.put(id, this.expects.get(id));
        }
        return variables;
    }

    public Map<String, Variable> visitExport(NelangParser.ExportContext ctx)  {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        Map<String, Variable> variables = new HashMap<String, Variable>();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            if (!this.currentLabel.variables().containsKey(id)) {
                this.reportException("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                        + " Variable " + id + " not declared in the label " + this.currentLabel.name(), ctx);
            }
            Variable variable = (Variable) this.currentLabel.variables().get(id);
            variables.put(id, variable);
            this.exports.put(id, variable); // Added to be exported to the next label
        }
        return variables;
    }

    public Variable visitAssignment(NelangParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Integer value = (Integer) visit(ctx.valuePosition());
        Variable variable = new Variable(id, value);
        this.currentLabel.addVariable(variable);
        return variable;
    }

    public Variable visitSum(NelangParser.SumContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        Integer toAdd = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() + toAdd;
        Variable newVariable = new Variable(id, newValue);
        this.currentLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitMinus(NelangParser.MinusContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        Integer toSubtract = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() - toSubtract;
        Variable newVariable = new Variable(id, newValue);
        this.currentLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitMultiply(NelangParser.MultiplyContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        Integer toMultiply = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() * toMultiply;
        Variable newVariable = new Variable(id, newValue);
        this.currentLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitDivide(NelangParser.DivideContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        Integer toDivide = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() / toDivide;
        Variable newVariable = new Variable(id, newValue);
        this.currentLabel.addVariable(newVariable);
        return newVariable;
    }

    public Map<String, Variable> visitPrint(NelangParser.PrintContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        Map<String, Variable> variables = new HashMap<String, Variable>();
        if (ids.isEmpty()) {
            System.out.println("");
            return variables;
        }
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            Variable variable = (Variable) this.currentLabel.variables().get(id);
            variables.put(id, variable);
            System.out.println(variable);
        }
        return variables;
    }

    public Object visitGoto(NelangParser.GotoContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Stack<VisitorContext> stacktrace = this.pushStacktrace(ctx);
        EvalVisitor visitor = new EvalVisitor(id, this.tree, stacktrace);
        visitor.visit(this.tree);
        // Update exported variables from the visited label
        Map<String, Variable> exports = visitor.exports();
        for (Variable variable : exports.values()) {
            if (!this.exports.containsKey(variable.name())) {
                continue; // The variable is not exported
            }
            this.exports.put(id, variable);
            this.currentLabel.addVariable(variable);
        }
        return null;
    }

    public Object visitIf(NelangParser.IfContext ctx) {
        boolean result = (boolean) visit(ctx.compare());
        boolean hasElse = ctx.else_() != null;
        if (hasElse) {
            if (result) {
                visit(ctx.goto_());
            } else {
                visit(ctx.else_());
            }
        } else {
            if (result) {
                visit(ctx.goto_());
            }
        }
        return null;
    }

    public Object visitWhile(NelangParser.WhileContext ctx) {
        boolean result = (boolean) visit(ctx.compare());
        while (result) {
            visit(ctx.goto_());
            result = (boolean) visit(ctx.compare());
        }
        return null;
    }

    public Boolean visitCompare(NelangParser.CompareContext ctx) {
        Integer firstValue = (Integer) visit(ctx.valuePosition(0));
        Integer secondValue = (Integer) visit(ctx.valuePosition(1));
        String operator = ctx.OPERATOR().getText();
        Boolean result = switch(operator) {
            case "EQ" -> firstValue == secondValue;
            case "NE" -> firstValue != secondValue;
            case "LT" -> firstValue < secondValue;
            case "LE" -> firstValue <= secondValue;
            case "GT" -> firstValue > secondValue;
            case "GE" -> firstValue >= secondValue;
            default -> false;
        };
        return result;
    }

    public Integer visitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return (Integer) this.currentLabel.variables().get(id).value();
    }

    public Integer visitIntegerAsValue(NelangParser.IntegerAsValueContext ctx) {
        return Integer.valueOf(ctx.INTEGER().getText());
    }

    @SuppressWarnings("unchecked")
    Stack<VisitorContext> pushStacktrace(ParserRuleContext context) {
        Stack<VisitorContext> stacktrace = (Stack<VisitorContext>) this.stacktrace.clone();
        stacktrace.push(new VisitorContext(this, context));
        return stacktrace;
    }

    void reportException(String message, ParserRuleContext context) throws NelangException {
        Stack<VisitorContext> stacktrace = pushStacktrace(context);
        throw new NelangException(message, stacktrace);
    }
}