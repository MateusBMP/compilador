import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;

public class CheckSemantic extends NelangBaseListener {

    // Memory
    Map<String, Object> memory = new HashMap<String, Object>();

    @Override
    public void exitDeclaration(NelangParser.DeclarationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!memory.containsKey(id)) {
            memory.put(id, null);
        } else {
            System.out.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Variable " + id + " already declared");
        }
    }

    @Override
    public void exitAssignment(NelangParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!memory.containsKey(id)) {
            System.out.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Variable " + id + " not declared");
        }
    }

    @Override
    public void exitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!memory.containsKey(id)) {
            System.out.println("Line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
                    + " Variable " + id + " not declared");
        }
    }
}