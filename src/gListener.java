// Generated from D:/MEGAsync/UNAL/12vo Semestre/Lenguajes de programacion/ANTLR JAVA\g.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(gParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(gParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dfarule}.
	 * @param ctx the parse tree
	 */
	void enterDfarule(gParser.DfaruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dfarule}.
	 * @param ctx the parse tree
	 */
	void exitDfarule(gParser.DfaruleContext ctx);
}