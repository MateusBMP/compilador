package compiler;

import compiler.nelang.antlr.NelangLexer;
import compiler.nelang.antlr.NelangParser;
import compiler.nelang.CheckSemantic;
import compiler.nelang.EvalVisitor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {

  public static void main(String[] args) {
    if (args.length < 1) {
      seeCommands();
      return;
    }

    // Get the second and subsequently arguments
    List<String> listArgs = Arrays.stream(args).collect(Collectors.toList());
    List<String> newArgs = listArgs.subList(1, listArgs.size());

    if (args[0].equals("gui")) {
      gui(newArgs);
    } else if (args[0].equals("tree")) {
      tree(newArgs);
    } else if (args[0].equals("eval")) {
      eval(newArgs);
    } else {
      System.out.println("Error: Invalid command");
      seeCommands();
    }
  }

  /**
   * Run the GUI using the TestRig class. Can be receive the same arguments as the TestRig class.
   * 
   * @see https://www.antlr.org/api/Java/org/antlr/v4/gui/TestRig.html
   */
  static void gui(List<String> args) {
    String[] fakeArgs = { "Nelang", "nelang", "-gui" };
    List<String> listArgs = Arrays
      .stream(fakeArgs)
      .collect(Collectors.toList());
    listArgs.addAll(args);
    String[] newArgs = listArgs.toArray(new String[listArgs.size()]);
    try {
      TestRig test = new TestRig(newArgs);
      test.process();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  /**
   * Run the tree walker. If the input is valid, it will print the tree in LISP-style. Else,
   * it will print the syntax error.
   */
  static void tree(List<String> args) {
    InputStream is = getInputStream(args);

    try {
      // Create a CharStream that reads from standard input or from a file
      CharStream input = CharStreams.fromStream(is);

      // create a lexer that feeds off of input CharStream
      NelangLexer lexer = new NelangLexer(input);

      // create a buffer of tokens pulled from the lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // create a parser that feeds off the tokens buffer
      NelangParser parser = new NelangParser(tokens);

      // begin parsing at init rule
      parser.addParseListener(new CheckSemantic());

      ParseTree tree = parser.nelang(); // begin parsing at nelang rule

      System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  /**
   * Run the interpreter.
   */
  static void eval(List<String> args) {
    InputStream is = getInputStream(args);

    try {
      // Create a CharStream that reads from standard input or from a file
      CharStream input = CharStreams.fromStream(is);

      // create a lexer that feeds off of input CharStream
      NelangLexer lexer = new NelangLexer(input);

      // create a buffer of tokens pulled from the lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // create a parser that feeds off the tokens buffer
      NelangParser parser = new NelangParser(tokens);
      ParseTree tree = parser.nelang(); // begin parsing at nelang rule

      EvalVisitor eval = new EvalVisitor();
      eval.visit(tree);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  static InputStream getInputStream(List<String> args) {
    String inputFile = null;

    if (args.size() > 0) {
      inputFile = args.get(0);
    }

    InputStream is = System.in;

    if (inputFile != null) {
      try {
        is = new FileInputStream(inputFile);
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
      }
    }

    return is;
  }

  static void seeCommands() {
    System.out.println("Commands:");
    System.out.println("  gui [args] - Run the TestRig GUI");
    System.out.println("  tree - Run the tree walker");
    System.out.println("  eval - Run the interpreter");
  }
}
