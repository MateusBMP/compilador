package compiler.nelang;

import compiler.nelang.antlr.NelangBaseListener;
import compiler.nelang.antlr.NelangParser;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;

public class CheckSemantic extends NelangBaseListener {

    // Memory
    Map<String, Label> labels = new HashMap<String, Label>();
    Label currentLabel = null;

    @Override
    public void exitNelang(NelangParser.NelangContext ctx) {
        if (!labels.containsKey("nlg")) {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Label nlg not declared");
        }
    }

    @Override
    public void exitInitLabel(NelangParser.InitLabelContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!labels.containsKey(id)) {
            Label label = new Label(id);
            labels.put(id, label);
            this.currentLabel = (Label) label;
        } else {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Label " + id + " already declared");
        }
    }

    @Override
    public void exitEndLabel(NelangParser.EndLabelContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!labels.containsKey(id)) {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Label " + id + " not declared");
        }
        this.currentLabel = null;
    }

    @Override
    public void exitDeclaration(NelangParser.DeclarationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!this.currentLabel.variables().containsKey(id)) {
            Variable variable = new Variable(id);
            this.currentLabel.addVariable(variable);
        } else {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Variable " + id + " already declared in the label " + this.currentLabel.name());
        }
    }

    @Override
    public void exitAssignment(NelangParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!this.currentLabel.variables().containsKey(id)) {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Variable " + id + " not declared in the label " + this.currentLabel.name());
        }
    }

    @Override
    public void exitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!this.currentLabel.variables().containsKey(id)) {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Variable " + id + " not declared in the label " + this.currentLabel.name());
        }
    }
}