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

    if (args[0].equals("gui")) {
      // Get the second and subsequently arguments
      List<String> listArgs = Arrays.stream(args).collect(Collectors.toList());
      List<String> newArgs = listArgs.subList(1, listArgs.size());
      gui(newArgs);
    } else if (args[0].equals("tree")) {
      tree();
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
    String[] fakeArgs = { "Expr", "expr", "-gui" };
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
  static void tree() {
    try {
      // create a CharStream that reads from standard input
      CharStream input = CharStreams.fromStream(System.in);

      // create a lexer that feeds off of input CharStream
      ExprLexer lexer = new ExprLexer(input);

      // create a buffer of tokens pulled from the lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // create a parser that feeds off the tokens buffer
      ExprParser parser = new ExprParser(tokens);

      ParseTree tree = parser.expr(); // begin parsing at expr rule
      System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  static void seeCommands() {
    System.out.println("Commands:");
    System.out.println("  gui [args] - Run the TestRig GUI");
    System.out.println("  tree - Run the tree walker");
  }
}
