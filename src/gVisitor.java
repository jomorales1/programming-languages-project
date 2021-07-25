// Generated from D:/MEGAsync/UNAL/12vo Semestre/Lenguajes de programacion/ANTLR JAVA\g.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(gParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dfarule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfarule(gParser.DfaruleContext ctx);
}