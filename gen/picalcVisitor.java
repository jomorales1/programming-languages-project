// Generated from D:/MEGAsync/UNAL/12vo Semestre/Lenguajes de programacion/ANTLR JAVA\picalc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link picalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface picalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link picalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(picalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(picalcParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(picalcParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPat(picalcParser.PatContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#otype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtype(picalcParser.OtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(picalcParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#abs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(picalcParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(picalcParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(picalcParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link picalcParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(picalcParser.LabelContext ctx);
}