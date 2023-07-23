package compiler.nelang;

import compiler.nelang.antlr.NelangBaseVisitor;
import compiler.nelang.antlr.NelangParser;
import java.io.InputStream;
import java.util.HashMap;
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

    public Variable visitDeclaration(NelangParser.DeclarationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = new Variable(id);
        this.focusedLabel.addVariable(variable);
        return variable;
    }

    public Variable visitAssignment(NelangParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Integer value = (Integer) visit(ctx.valuePosition());
        Variable variable = new Variable(id, value);
        this.focusedLabel.addVariable(variable);
        return variable;
    }

    public Variable visitSum(NelangParser.SumContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.focusedLabel.variables().get(id);
        Integer toAdd = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() + toAdd;
        Variable newVariable = new Variable(id, newValue);
        this.focusedLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitMinus(NelangParser.MinusContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.focusedLabel.variables().get(id);
        Integer toSubtract = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() - toSubtract;
        Variable newVariable = new Variable(id, newValue);
        this.focusedLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitMultiply(NelangParser.MultiplyContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.focusedLabel.variables().get(id);
        Integer toMultiply = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() * toMultiply;
        Variable newVariable = new Variable(id, newValue);
        this.focusedLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitDivide(NelangParser.DivideContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.focusedLabel.variables().get(id);
        Integer toDivide = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() / toDivide;
        Variable newVariable = new Variable(id, newValue);
        this.focusedLabel.addVariable(newVariable);
        return newVariable;
    }

    public Variable visitPrint(NelangParser.PrintContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.focusedLabel.variables().get(id);
        System.out.println(variable);
        return variable;
    }

    public Object visitGoto(NelangParser.GotoContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        EvalVisitor visitor = new EvalVisitor(id, this.tree);
        visitor.visit(this.tree);
        return null;
    }

    public Integer visitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return (Integer) this.focusedLabel.variables().get(id).value();
    }

    public Integer visitIntegerAsValue(NelangParser.IntegerAsValueContext ctx) {
        return Integer.valueOf(ctx.INTEGER().getText());
    }
}