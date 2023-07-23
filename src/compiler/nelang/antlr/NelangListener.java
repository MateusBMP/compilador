// Generated from ./src/compiler/nelang/Nelang.g4 by ANTLR 4.13.0
package compiler.nelang.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NelangParser}.
 */
public interface NelangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NelangParser#nelang}.
	 * @param ctx the parse tree
	 */
	void enterNelang(NelangParser.NelangContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#nelang}.
	 * @param ctx the parse tree
	 */
	void exitNelang(NelangParser.NelangContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#initNLG}.
	 * @param ctx the parse tree
	 */
	void enterInitNLG(NelangParser.InitNLGContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#initNLG}.
	 * @param ctx the parse tree
	 */
	void exitInitNLG(NelangParser.InitNLGContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#endNLG}.
	 * @param ctx the parse tree
	 */
	void enterEndNLG(NelangParser.EndNLGContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#endNLG}.
	 * @param ctx the parse tree
	 */
	void exitEndNLG(NelangParser.EndNLGContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NelangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NelangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(NelangParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(NelangParser.EndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(NelangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(NelangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(NelangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(NelangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(NelangParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(NelangParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(NelangParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(NelangParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(NelangParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(NelangParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(NelangParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(NelangParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(NelangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(NelangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#valuePosition}.
	 * @param ctx the parse tree
	 */
	void enterValuePosition(NelangParser.ValuePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#valuePosition}.
	 * @param ctx the parse tree
	 */
	void exitValuePosition(NelangParser.ValuePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#identifierAsValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#identifierAsValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#integerAsValue}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAsValue(NelangParser.IntegerAsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#integerAsValue}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAsValue(NelangParser.IntegerAsValueContext ctx);
}