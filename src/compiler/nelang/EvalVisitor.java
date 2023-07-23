package compiler.nelang;

import compiler.nelang.antlr.NelangBaseVisitor;
import compiler.nelang.antlr.NelangParser;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends NelangBaseVisitor {

    // Memory
    Map<String, Label> labels = new HashMap<String, Label>();
    Label currentLabel = null;

    @Override
    public Label visitInitLabel(NelangParser.InitLabelContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Label label = new Label(id);
        this.labels.put(id, label);
        this.currentLabel = label;
        return label;
    }

    @Override
    public Variable visitDeclaration(NelangParser.DeclarationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = new Variable(id);
        this.currentLabel.addVariable(variable);
        this.labels.put(this.currentLabel.name(), this.currentLabel);
        return variable;
    }

    @Override
    public Variable visitAssignment(NelangParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Integer value = (Integer) visit(ctx.valuePosition());
        Variable variable = new Variable(id, value);
        this.currentLabel.addVariable(variable);
        this.labels.put(this.currentLabel.name(), this.currentLabel);
        return variable;
    }

    @Override
    public Variable visitSum(NelangParser.SumContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        Integer toAdd = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() + toAdd;
        Variable newVariable = new Variable(id, newValue);
        this.currentLabel.addVariable(newVariable);
        this.labels.put(this.currentLabel.name(), this.currentLabel);
        return newVariable;
    }

    @Override
    public Variable visitMinus(NelangParser.MinusContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        Integer toSubtract = (Integer) visit(ctx.valuePosition());
        Integer newValue = variable.value() - toSubtract;
        Variable newVariable = new Variable(id, newValue);
        this.currentLabel.addVariable(newVariable);
        this.labels.put(this.currentLabel.name(), this.currentLabel);
        return newVariable;
    }

    @Override
    public Variable visitPrint(NelangParser.PrintContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = (Variable) this.currentLabel.variables().get(id);
        System.out.println(variable);
        return variable;
    }

    @Override
    public Integer visitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return (Integer) this.currentLabel.variables().get(id).value();
    }

    @Override
    public Integer visitIntegerAsValue(NelangParser.IntegerAsValueContext ctx) {
        return Integer.valueOf(ctx.INTEGER().getText());
    }
}