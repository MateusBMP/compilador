package compiler.nelang;

import compiler.nelang.antlr.NelangBaseListener;
import compiler.nelang.antlr.NelangParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

public class CheckSemantic extends NelangBaseListener {

    // Memory
    Map<String, Label> labels = new HashMap<String, Label>();
    Label currentLabel = null;
    Map<String, ParserRuleContext> expects = new HashMap<String, ParserRuleContext>();
    Map<String, ParserRuleContext> exports = new HashMap<String, ParserRuleContext>();

    @Override
    public void exitNelang(NelangParser.NelangContext ctx) {
        if (!labels.containsKey("nlg")) {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Label nlg not declared");
        }
        for (String id : expects.keySet()) {
            if (!exports.containsKey(id)) {
                System.err.println("Line " + expects.get(id).getStart().getLine() + ":"
                        + expects.get(id).getStart().getCharPositionInLine() + " [Warning] Variable " + id
                        + " is expected but a export is missing");
            }
        }
        for (String id : exports.keySet()) {
            if (!expects.containsKey(id)) {
                System.err.println("Line " + exports.get(id).getStart().getLine() + ":"
                        + exports.get(id).getStart().getCharPositionInLine() + " [Warning] Variable " + id
                        + " is exported but a expect is missing");
            }
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
    public void exitPrint(NelangParser.PrintContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            if (!this.currentLabel.variables().containsKey(id)) {
                System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                        + " Variable " + id + " not declared in the label " + this.currentLabel.name());
            }
        }
    }

    @Override
    public void exitDeclaration(NelangParser.DeclarationContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            if (!this.currentLabel.variables().containsKey(id)) {
                Variable variable = new Variable(id);
                this.currentLabel.addVariable(variable);
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                        + " Variable " + id + " already declared in the label " + this.currentLabel.name());
            }
        }
    }

    @Override
    public void exitExpect(NelangParser.ExpectContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            if (!this.currentLabel.variables().containsKey(id)) {
                Variable variable = new Variable(id);
                this.currentLabel.addVariable(variable);
            }
            expects.put(id, ctx);
        }
    }

    @Override
    public void exitExport(NelangParser.ExportContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            exports.put(id, ctx);
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
    public void exitGoto(NelangParser.GotoContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!labels.containsKey(id)) {
            System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Label " + id + " not declared");
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