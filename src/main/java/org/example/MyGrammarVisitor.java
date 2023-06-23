// Generated from C:/Users/cesar/IdeaProjects/TALF_aplicacion1/src/main/java/org/example\MyGrammar.g4 by ANTLR 4.12.0

  package org.example;

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(MyGrammarParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MyGrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#putOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutOutput(MyGrammarParser.PutOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#getInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetInput(MyGrammarParser.GetInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyGrammarParser.ExpressionContext ctx);
}