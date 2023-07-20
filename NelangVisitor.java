// Generated from Nelang.g4 by ANTLR 4.13.0
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
	 * Visit a parse tree produced by {@link NelangParser#initNLG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitNLG(NelangParser.InitNLGContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#endNLG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndNLG(NelangParser.EndNLGContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NelangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#endStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStatement(NelangParser.EndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NelangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(NelangParser.DeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link NelangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(NelangParser.PrintContext ctx);
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