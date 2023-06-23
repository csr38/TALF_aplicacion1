// Generated from C:/Users/cesar/IdeaProjects/TALF_aplicacion1/src/main/java/org/example\MyGrammar.g4 by ANTLR 4.12.0

  package org.example;

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(MyGrammarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(MyGrammarParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MyGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MyGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#putOutput}.
	 * @param ctx the parse tree
	 */
	void enterPutOutput(MyGrammarParser.PutOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#putOutput}.
	 * @param ctx the parse tree
	 */
	void exitPutOutput(MyGrammarParser.PutOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#getInput}.
	 * @param ctx the parse tree
	 */
	void enterGetInput(MyGrammarParser.GetInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#getInput}.
	 * @param ctx the parse tree
	 */
	void exitGetInput(MyGrammarParser.GetInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyGrammarParser.ExpressionContext ctx);
}