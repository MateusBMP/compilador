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
	 * Enter a parse tree produced by {@link NelangParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(NelangParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(NelangParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#initLabel}.
	 * @param ctx the parse tree
	 */
	void enterInitLabel(NelangParser.InitLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#initLabel}.
	 * @param ctx the parse tree
	 */
	void exitInitLabel(NelangParser.InitLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#endLabel}.
	 * @param ctx the parse tree
	 */
	void enterEndLabel(NelangParser.EndLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#endLabel}.
	 * @param ctx the parse tree
	 */
	void exitEndLabel(NelangParser.EndLabelContext ctx);
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
	 * Enter a parse tree produced by {@link NelangParser#endLine}.
	 * @param ctx the parse tree
	 */
	void enterEndLine(NelangParser.EndLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#endLine}.
	 * @param ctx the parse tree
	 */
	void exitEndLine(NelangParser.EndLineContext ctx);
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
	 * Enter a parse tree produced by {@link NelangParser#expect}.
	 * @param ctx the parse tree
	 */
	void enterExpect(NelangParser.ExpectContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#expect}.
	 * @param ctx the parse tree
	 */
	void exitExpect(NelangParser.ExpectContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(NelangParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(NelangParser.ExportContext ctx);
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
	 * Enter a parse tree produced by {@link NelangParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(NelangParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(NelangParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(NelangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(NelangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(NelangParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(NelangParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(NelangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(NelangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NelangParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(NelangParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link NelangParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(NelangParser.CompareContext ctx);
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