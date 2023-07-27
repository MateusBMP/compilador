package compiler.nelang;

import compiler.nelang.antlr.NelangLexer;
import compiler.nelang.antlr.NelangParser;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class NelangHelper {

    public static NelangParser getParser(InputStream is) throws Exception {
        CharStream input = CharStreams.fromStream(is);
        NelangLexer lexer = new NelangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NelangParser parser = new NelangParser(tokens);
        return parser;
    }

    public static ParseTree getParseTree(NelangParser parser) throws Exception {
        CheckSemantic checkSemantic = new CheckSemantic();
        parser.addParseListener(checkSemantic);
        ParseTree tree = parser.nelang();
        boolean hasErrors = checkSemantic.errorsCount() > 0 || parser.getNumberOfSyntaxErrors() > 0;
        if (hasErrors) {
            throw new Exception("Syntax error. Check the output for more details.");
        }
        return tree;
    }

    public static ParseTree getParseTree(InputStream is) throws Exception {
        NelangParser parser = getParser(is);
        CheckSemantic checkSemantic = new CheckSemantic();
        parser.addParseListener(checkSemantic);
        ParseTree tree = parser.nelang();
        boolean hasErrors = checkSemantic.errorsCount() > 0 || parser.getNumberOfSyntaxErrors() > 0;
        if (hasErrors) {
            throw new Exception("Syntax error. Check the output for more details.");
        }
        return tree;
    }
}