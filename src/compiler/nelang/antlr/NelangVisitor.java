// Generated from ./src/compiler/nelang/Nelang.g4 by ANTLR 4.13.0
package compiler.nelang.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NelangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NelangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NelangParser#nelang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNelang(NelangParser.NelangContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(NelangParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#initLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitLabel(NelangParser.InitLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#endLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLabel(NelangParser.EndLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NelangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#endLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLine(NelangParser.EndLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(NelangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#expect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpect(NelangParser.ExpectContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(NelangParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(NelangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(NelangParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(NelangParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(NelangParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(NelangParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(NelangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(NelangParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(NelangParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(NelangParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(NelangParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#valuePosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePosition(NelangParser.ValuePositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#identifierAsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAsValue(NelangParser.IdentifierAsValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#integerAsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAsValue(NelangParser.IntegerAsValueContext ctx);
}