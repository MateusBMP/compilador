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
        parser.addParseListener(new CheckSemantic());
        return parser;
    }

    public static ParseTree getParseTree(NelangParser parser) throws Exception {
        ParseTree tree = parser.nelang();
        return tree;
    }

    public static ParseTree getParseTree(InputStream is) throws Exception {
        NelangParser parser = getParser(is);
        ParseTree tree = parser.nelang();
        return tree;
    }
}