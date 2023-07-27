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

    int errorsCount = 0;
    int warningsCount = 0;

    // Memory
    Map<String, Label> labels = new HashMap<String, Label>();
    Label currentLabel = null;
    Map<String, ParserRuleContext> expects = new HashMap<String, ParserRuleContext>();
    Map<String, ParserRuleContext> exports = new HashMap<String, ParserRuleContext>();

    public int errorsCount() {
        return this.errorsCount;
    }

    public int warningsCount() {
        return this.warningsCount;
    }

    @Override
    public void exitNelang(NelangParser.NelangContext ctx) {
        if (!labels.containsKey("nlg")) {
            this.reportError("Label nlg not declared", ctx);
        }
        for (String id : expects.keySet()) {
            if (!exports.containsKey(id)) {
                this.reportWarning("Variable " + id + " is expected but a export is missing", expects.get(id));
            }
        }
        for (String id : exports.keySet()) {
            if (!expects.containsKey(id)) {
                this.reportWarning("Variable " + id + " is exported but a expect is missing", exports.get(id));
            }
        }
    }

    @Override
    public void exitInitLabel(NelangParser.InitLabelContext ctx) {
        TerminalNode identifier = ctx.IDENTIFIER();
        if (identifier == null) {
            this.reportError("Label must have a name", ctx);
            return;
        }
        String id = identifier.getText();
        if (!labels.containsKey(id)) {
            Label label = new Label(id);
            labels.put(id, label);
            this.currentLabel = (Label) label;
        } else {
            this.reportError("Label " + id + " already declared", ctx);
        }
    }

    @Override
    public void exitEndLabel(NelangParser.EndLabelContext ctx) {
        TerminalNode identifier = ctx.IDENTIFIER();
        if (identifier == null) {
            this.reportError("Label must have a name", ctx);
            return;
        }
        String id = identifier.getText();
        if (!labels.containsKey(id)) {
            this.reportError("Label " + id + " not declared", ctx);
        }
        this.currentLabel = null;
    }

    @Override
    public void exitPrint(NelangParser.PrintContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();
        for (String id : ids.stream().map(TerminalNode::getText).toList()) {
            if (!this.currentLabel.variables().containsKey(id)) {
                this.reportError("Variable " + id + " not declared in the label " + this.currentLabel.name(), ctx);
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
                this.reportError("Variable " + id + " already declared in the label " + this.currentLabel.name(), ctx);
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
        TerminalNode identifier = ctx.IDENTIFIER();
        if (identifier == null) {
            this.reportError("Label must have a name", ctx);
            return;
        }
        String id = identifier.getText();
        if (!this.currentLabel.variables().containsKey(id)) {
            this.reportError("Variable " + id + " not declared in the label " + this.currentLabel.name(), ctx);
        }
    }

    @Override
    public void exitGoto(NelangParser.GotoContext ctx) {
        TerminalNode identifier = ctx.IDENTIFIER();
        if (identifier == null) {
            this.reportError("Label must have a name", ctx);
            return;
        }
        String id = identifier.getText();
        if (!labels.containsKey(id)) {
            this.reportError("Label " + id + " not declared", ctx);
        }
    }

    @Override
    public void exitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        TerminalNode identifier = ctx.IDENTIFIER();
        if (identifier == null) {
            this.reportError("Label must have a name", ctx);
            return;
        }
        String id = identifier.getText();
        if (!this.currentLabel.variables().containsKey(id)) {
            this.reportError("Variable " + id + " not declared in the label " + this.currentLabel.name(), ctx);
        }
    }

    void reportError(String message, ParserRuleContext ctx) {
        this.errorsCount++;
        System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                + " [Error] " + message);
    }

    void reportWarning(String message, ParserRuleContext ctx) {
        this.warningsCount++;
        System.err.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                + " [Warning] " + message);
    }
}
