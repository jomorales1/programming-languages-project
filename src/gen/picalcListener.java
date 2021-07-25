package gen;// Generated from D:/MEGAsync/UNAL/12vo Semestre/Lenguajes de programacion/ANTLR JAVA\picalc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link picalcParser}.
 */
public interface picalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link picalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(picalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(picalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(picalcParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(picalcParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(picalcParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(picalcParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(picalcParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(picalcParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#otype}.
	 * @param ctx the parse tree
	 */
	void enterOtype(picalcParser.OtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#otype}.
	 * @param ctx the parse tree
	 */
	void exitOtype(picalcParser.OtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(picalcParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(picalcParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#abs}.
	 * @param ctx the parse tree
	 */
	void enterAbs(picalcParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#abs}.
	 * @param ctx the parse tree
	 */
	void exitAbs(picalcParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(picalcParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(picalcParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(picalcParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(picalcParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalcParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(picalcParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalcParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(picalcParser.LabelContext ctx);
}