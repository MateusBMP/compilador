package compiler;

import compiler.nelang.antlr.NelangParser;
import compiler.nelang.EvalVisitor;
import compiler.nelang.NelangException;
import compiler.nelang.NelangHelper;
import compiler.nelang.VisitorContext;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
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
    String[] fakeArgs = { "compiler.nelang.antlr.Nelang", "nelang", "-gui" };
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
    try {
      InputStream is = getInputStream(args);
      NelangParser parser = NelangHelper.getParser(is);
      ParseTree tree = NelangHelper.getParseTree(parser);
      System.out.println(tree.toStringTree(parser));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Run the interpreter.
   */
  static void eval(List<String> args) {
    try {
      InputStream is = getInputStream(args);
      ParseTree tree = NelangHelper.getParseTree(is);
      EvalVisitor eval = new EvalVisitor(tree);
      eval.visit(tree);
    } catch (NelangException e) {
      Stack<VisitorContext> stacktrace = e.stacktrace();
      System.out.println("Error: " + e.getMessage());
      System.out.println("Stacktrace:");
      while (!stacktrace.isEmpty()) {
        VisitorContext visitorContext = stacktrace.pop();
        System.out.println("  #" + stacktrace.size() + " : Label " + visitorContext.visitor().currentLabel().name()  + " Line " + visitorContext.context().getStart().getLine() + ":" + visitorContext.context().getStart().getCharPositionInLine());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
  }

  static InputStream getInputStream(List<String> args) throws Exception {
    String inputFile = null;

    if (args.size() > 0) {
      inputFile = args.get(0);
    }

    InputStream is = System.in;

    if (inputFile != null) {
      is = new FileInputStream(inputFile);
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
