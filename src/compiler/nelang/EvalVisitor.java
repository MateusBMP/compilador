package compiler.nelang;

import compiler.nelang.antlr.NelangBaseVisitor;
import compiler.nelang.antlr.NelangParser;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends NelangBaseVisitor {

    // Memory
    Map<String, Object> memory = new HashMap<String, Object>();

    @Override
    public Integer visitDeclaration(NelangParser.DeclarationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        memory.put(id, 0);
        return 0;
    }

    @Override
    public Integer visitAssignment(NelangParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Integer value = (Integer) visit(ctx.valuePosition());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitSum(NelangParser.SumContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Integer value = (Integer) memory.get(id);
        Integer toAdd = (Integer) visit(ctx.valuePosition());
        Integer newValue = value + toAdd;
        memory.put(id, newValue);
        return newValue;
    }

    @Override
    public Integer visitMinus(NelangParser.MinusContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Integer value = (Integer) memory.get(id);
        Integer toSubtract = (Integer) visit(ctx.valuePosition());
        Integer newValue = value - toSubtract;
        memory.put(id, newValue);
        return newValue;
    }

    @Override
    public Integer visitPrint(NelangParser.PrintContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        System.out.println(memory.get(id));
        return 0;
    }

    @Override
    public Integer visitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return (Integer) memory.get(id);
    }

    @Override
    public Integer visitIntegerAsValue(NelangParser.IntegerAsValueContext ctx) {
        return Integer.valueOf(ctx.INTEGER().getText());
    }
}