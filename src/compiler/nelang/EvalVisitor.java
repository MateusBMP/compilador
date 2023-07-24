package compiler.nelang;

import compiler.nelang.antlr.NelangBaseVisitor;
import compiler.nelang.antlr.NelangParser;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("CheckReturnValue")
public class EvalVisitor extends NelangBaseVisitor {

    ParseTree tree;

    // Memory
    Label focusedLabel = null;
    Label currentLabel = null;

    public EvalVisitor(ParseTree tree) {
        this("nlg", tree);
    }

    public EvalVisitor(String label, ParseTree tree) {
        this.focusedLabel = new Label(label);
        this.tree = tree;
    }

    public Object visitLabel(NelangParser.LabelContext ctx) {
        Label label = (Label) visit(ctx.initLabel());
        if (!label.equals(this.focusedLabel)) {
            return null;
        }
        return visitChildren(ctx);
    }

    public Label visitInitLabel(NelangParser.InitLabelContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Label label = new Label(id);
        this.currentLabel = label;
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

    public Variable visitPrint(NelangParser.PrintContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        System.out.println(variable);
        return variable;
    }

    public Object visitGoto(NelangParser.GotoContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        EvalVisitor visitor = new EvalVisitor(id, this.tree);
        visitor.visit(this.tree);
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
}