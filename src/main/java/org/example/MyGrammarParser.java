// Generated from C:/Users/cesar/IdeaProjects/TALF_aplicacion1/src/main/java/org/example\MyGrammar.g4 by ANTLR 4.12.0

  package org.example;

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, INT=25, 
		NEWLINE=26, WS=27;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_comment = 2, RULE_assignment = 3, 
		RULE_whileLoop = 4, RULE_ifStatement = 5, RULE_putOutput = 6, RULE_getInput = 7, 
		RULE_expression = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "comment", "assignment", "whileLoop", "ifStatement", 
			"putOutput", "getInput", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "';'", "'while'", "'('", "')'", "'{'", "'}'", "'if'", "'else'", 
			"'put'", "'get'", "' '", "'/'", "'*'", "'+'", "'-'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50339802L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public GetInputContext getInput() {
			return getRuleContext(GetInputContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PutOutputContext putOutput() {
			return getRuleContext(PutOutputContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				comment(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				getInput(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				assignment(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				whileLoop(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				ifStatement(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(28);
				putOutput(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(29);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		return comment(0);
	}

	private CommentContext comment(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommentContext _localctx = new CommentContext(_ctx, _parentState);
		CommentContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_comment, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(33);
			match(T__0);
			setState(34);
			expression(0);
			setState(35);
			match(NEWLINE);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommentContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comment);
					setState(37);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(38);
					statement();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		return assignment(0);
	}

	private AssignmentContext assignment(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssignmentContext _localctx = new AssignmentContext(_ctx, _parentState);
		AssignmentContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_assignment, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			match(ID);
			setState(46);
			expression(0);
			setState(47);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AssignmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment);
						setState(49);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(50);
						match(NEWLINE);
						}
						break;
					case 2:
						{
						_localctx = new AssignmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment);
						setState(51);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(52);
						statement();
						}
						break;
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		return whileLoop(0);
	}

	private WhileLoopContext whileLoop(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, _parentState);
		WhileLoopContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_whileLoop, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(59);
				match(T__2);
				setState(60);
				match(T__3);
				setState(61);
				expression(0);
				setState(62);
				match(T__4);
				setState(63);
				match(T__5);
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(64);
						statement();
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(70);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(72);
				match(T__2);
				setState(73);
				match(T__3);
				setState(74);
				expression(0);
				setState(75);
				match(T__4);
				setState(76);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				setState(78);
				match(T__2);
				setState(79);
				match(T__3);
				setState(80);
				expression(0);
				setState(81);
				match(T__4);
				setState(82);
				match(T__5);
				setState(83);
				match(NEWLINE);
				}
				break;
			case 4:
				{
				setState(85);
				match(T__5);
				}
				break;
			case 5:
				{
				setState(86);
				match(T__6);
				}
				break;
			case 6:
				{
				setState(87);
				match(T__2);
				}
				break;
			case 7:
				{
				setState(88);
				match(T__5);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						statement();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(95);
				match(T__6);
				setState(96);
				match(NEWLINE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new WhileLoopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_whileLoop);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(NEWLINE);
						}
						break;
					case 2:
						{
						_localctx = new WhileLoopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_whileLoop);
						setState(101);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(102);
						statement();
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		return ifStatement(0);
	}

	private IfStatementContext ifStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IfStatementContext _localctx = new IfStatementContext(_ctx, _parentState);
		IfStatementContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_ifStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(109);
				match(T__7);
				setState(110);
				match(T__3);
				setState(111);
				expression(0);
				setState(112);
				match(T__4);
				setState(113);
				match(T__5);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						statement();
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(120);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(122);
				match(T__7);
				setState(123);
				match(T__3);
				setState(124);
				expression(0);
				setState(125);
				match(T__4);
				setState(126);
				match(NEWLINE);
				setState(127);
				match(T__5);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						statement();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(134);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(136);
				match(T__8);
				setState(137);
				match(T__5);
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						statement();
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(144);
				match(T__6);
				}
				break;
			case 4:
				{
				setState(145);
				match(T__8);
				setState(146);
				match(NEWLINE);
				setState(147);
				match(T__5);
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						statement();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(154);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new IfStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ifStatement);
						setState(157);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(158);
						match(NEWLINE);
						}
						break;
					case 2:
						{
						_localctx = new IfStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ifStatement);
						setState(159);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(160);
						statement();
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutOutputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PutOutputContext putOutput() {
			return getRuleContext(PutOutputContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PutOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPutOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPutOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPutOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutOutputContext putOutput() throws RecognitionException {
		return putOutput(0);
	}

	private PutOutputContext putOutput(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PutOutputContext _localctx = new PutOutputContext(_ctx, _parentState);
		PutOutputContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_putOutput, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			match(T__9);
			setState(168);
			expression(0);
			setState(169);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new PutOutputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_putOutput);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
						match(NEWLINE);
						}
						break;
					case 2:
						{
						_localctx = new PutOutputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_putOutput);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						statement();
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetInputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetInputContext getInput() {
			return getRuleContext(GetInputContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public GetInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGetInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGetInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitGetInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetInputContext getInput() throws RecognitionException {
		return getInput(0);
	}

	private GetInputContext getInput(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GetInputContext _localctx = new GetInputContext(_ctx, _parentState);
		GetInputContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_getInput, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			match(T__10);
			setState(182);
			expression(0);
			setState(183);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new GetInputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_getInput);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(NEWLINE);
						}
						break;
					case 2:
						{
						_localctx = new GetInputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_getInput);
						setState(187);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(188);
						statement();
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(195);
				match(T__11);
				}
				break;
			case 2:
				{
				setState(196);
				match(ID);
				}
				break;
			case 3:
				{
				setState(197);
				match(ID);
				setState(198);
				expression(7);
				}
				break;
			case 4:
				{
				setState(199);
				match(INT);
				}
				break;
			case 5:
				{
				setState(200);
				match(INT);
				setState(201);
				expression(5);
				}
				break;
			case 6:
				{
				setState(202);
				match(T__3);
				setState(203);
				expression(0);
				setState(204);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16769024L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(NEWLINE);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(214);
						statement();
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return comment_sempred((CommentContext)_localctx, predIndex);
		case 3:
			return assignment_sempred((AssignmentContext)_localctx, predIndex);
		case 4:
			return whileLoop_sempred((WhileLoopContext)_localctx, predIndex);
		case 5:
			return ifStatement_sempred((IfStatementContext)_localctx, predIndex);
		case 6:
			return putOutput_sempred((PutOutputContext)_localctx, predIndex);
		case 7:
			return getInput_sempred((GetInputContext)_localctx, predIndex);
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comment_sempred(CommentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_sempred(AssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean whileLoop_sempred(WhileLoopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ifStatement_sempred(IfStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean putOutput_sempred(PutOutputContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean getInput_sempred(GetInputContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000"+
		"\u0015\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b"+
		"\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00036\b\u0003\n\u0003\f\u00039\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004B\b"+
		"\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004[\b"+
		"\u0004\n\u0004\f\u0004^\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004h\b"+
		"\u0004\n\u0004\f\u0004k\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005"+
		"\f\u0005w\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0082"+
		"\b\u0005\n\u0005\f\u0005\u0085\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u008c\b\u0005\n\u0005\f\u0005\u008f"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0096\b\u0005\n\u0005\f\u0005\u0099\t\u0005\u0001\u0005\u0003\u0005"+
		"\u009c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00a2\b\u0005\n\u0005\f\u0005\u00a5\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00b0\b\u0006\n\u0006\f\u0006\u00b3\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00be\b\u0007\n\u0007\f\u0007\u00c1"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cf\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d8\b\b\n\b\f\b\u00db\t\b"+
		"\u0001\b\u0000\u0007\u0004\u0006\b\n\f\u000e\u0010\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\r\u0017\u00fc\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004 \u0001"+
		"\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000"+
		"\u0000\n\u009b\u0001\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000"+
		"\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00ce\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000"+
		"\u0017\u001f\u0003\u0004\u0002\u0000\u0018\u001f\u0003\u000e\u0007\u0000"+
		"\u0019\u001f\u0003\u0006\u0003\u0000\u001a\u001f\u0003\b\u0004\u0000\u001b"+
		"\u001f\u0003\n\u0005\u0000\u001c\u001f\u0003\f\u0006\u0000\u001d\u001f"+
		"\u0003\u0010\b\u0000\u001e\u0017\u0001\u0000\u0000\u0000\u001e\u0018\u0001"+
		"\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001a\u0001"+
		"\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0003\u0001"+
		"\u0000\u0000\u0000 !\u0006\u0002\uffff\uffff\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0003\u0010\b\u0000#$\u0005\u001a\u0000\u0000$)\u0001\u0000"+
		"\u0000\u0000%&\n\u0001\u0000\u0000&(\u0003\u0002\u0001\u0000\'%\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0006\u0003\uffff\uffff\u0000-.\u0005\u0018\u0000\u0000"+
		"./\u0003\u0010\b\u0000/0\u0005\u0002\u0000\u000007\u0001\u0000\u0000\u0000"+
		"12\n\u0002\u0000\u000026\u0005\u001a\u0000\u000034\n\u0001\u0000\u0000"+
		"46\u0003\u0002\u0001\u000051\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0007\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":;\u0006\u0004\uffff\uffff\u0000;<\u0005\u0003\u0000\u0000<=\u0005\u0004"+
		"\u0000\u0000=>\u0003\u0010\b\u0000>?\u0005\u0005\u0000\u0000?C\u0005\u0006"+
		"\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0007\u0000"+
		"\u0000Gb\u0001\u0000\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0004"+
		"\u0000\u0000JK\u0003\u0010\b\u0000KL\u0005\u0005\u0000\u0000LM\u0005\u001a"+
		"\u0000\u0000Mb\u0001\u0000\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0005"+
		"\u0004\u0000\u0000PQ\u0003\u0010\b\u0000QR\u0005\u0005\u0000\u0000RS\u0005"+
		"\u0006\u0000\u0000ST\u0005\u001a\u0000\u0000Tb\u0001\u0000\u0000\u0000"+
		"Ub\u0005\u0006\u0000\u0000Vb\u0005\u0007\u0000\u0000Wb\u0005\u0003\u0000"+
		"\u0000X\\\u0005\u0006\u0000\u0000Y[\u0003\u0002\u0001\u0000ZY\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0007\u0000\u0000`b\u0005\u001a\u0000\u0000a:\u0001\u0000\u0000"+
		"\u0000aH\u0001\u0000\u0000\u0000aN\u0001\u0000\u0000\u0000aU\u0001\u0000"+
		"\u0000\u0000aV\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000aX\u0001"+
		"\u0000\u0000\u0000bi\u0001\u0000\u0000\u0000cd\n\u0002\u0000\u0000dh\u0005"+
		"\u001a\u0000\u0000ef\n\u0001\u0000\u0000fh\u0003\u0002\u0001\u0000gc\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0006\u0005\uffff\uffff\u0000mn\u0005"+
		"\b\u0000\u0000no\u0005\u0004\u0000\u0000op\u0003\u0010\b\u0000pq\u0005"+
		"\u0005\u0000\u0000qu\u0005\u0006\u0000\u0000rt\u0003\u0002\u0001\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0007\u0000\u0000y\u009c\u0001\u0000\u0000\u0000"+
		"z{\u0005\b\u0000\u0000{|\u0005\u0004\u0000\u0000|}\u0003\u0010\b\u0000"+
		"}~\u0005\u0005\u0000\u0000~\u007f\u0005\u001a\u0000\u0000\u007f\u0083"+
		"\u0005\u0006\u0000\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005\u0007\u0000\u0000\u0087\u009c\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\t\u0000\u0000\u0089\u008d\u0005\u0006\u0000\u0000\u008a\u008c\u0003"+
		"\u0002\u0001\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u009c\u0005\u0007\u0000\u0000\u0091\u0092\u0005"+
		"\t\u0000\u0000\u0092\u0093\u0005\u001a\u0000\u0000\u0093\u0097\u0005\u0006"+
		"\u0000\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u0007"+
		"\u0000\u0000\u009bl\u0001\u0000\u0000\u0000\u009bz\u0001\u0000\u0000\u0000"+
		"\u009b\u0088\u0001\u0000\u0000\u0000\u009b\u0091\u0001\u0000\u0000\u0000"+
		"\u009c\u00a3\u0001\u0000\u0000\u0000\u009d\u009e\n\u0002\u0000\u0000\u009e"+
		"\u00a2\u0005\u001a\u0000\u0000\u009f\u00a0\n\u0001\u0000\u0000\u00a0\u00a2"+
		"\u0003\u0002\u0001\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u000b"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0006\u0006\uffff\uffff\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9"+
		"\u0003\u0010\b\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa\u00b1\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\n\u0002\u0000\u0000\u00ac\u00b0\u0005\u001a"+
		"\u0000\u0000\u00ad\u00ae\n\u0001\u0000\u0000\u00ae\u00b0\u0003\u0002\u0001"+
		"\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\r\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006\u0007\uffff\uffff"+
		"\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b7\u0003\u0010\b\u0000"+
		"\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00bf\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\n\u0002\u0000\u0000\u00ba\u00be\u0005\u001a\u0000\u0000\u00bb"+
		"\u00bc\n\u0001\u0000\u0000\u00bc\u00be\u0003\u0002\u0001\u0000\u00bd\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u000f\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006\b\uffff\uffff\u0000\u00c3\u00cf"+
		"\u0005\f\u0000\u0000\u00c4\u00cf\u0005\u0018\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0018\u0000\u0000\u00c6\u00cf\u0003\u0010\b\u0007\u00c7\u00cf\u0005\u0019"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0019\u0000\u0000\u00c9\u00cf\u0003\u0010"+
		"\b\u0005\u00ca\u00cb\u0005\u0004\u0000\u0000\u00cb\u00cc\u0003\u0010\b"+
		"\u0000\u00cc\u00cd\u0005\u0005\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000"+
		"\u0000\u00ce\u00c2\u0001\u0000\u0000\u0000\u00ce\u00c4\u0001\u0000\u0000"+
		"\u0000\u00ce\u00c5\u0001\u0000\u0000\u0000\u00ce\u00c7\u0001\u0000\u0000"+
		"\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d9\u0001\u0000\u0000\u0000\u00d0\u00d1\n\u0004\u0000\u0000"+
		"\u00d1\u00d2\u0007\u0000\u0000\u0000\u00d2\u00d8\u0003\u0010\b\u0005\u00d3"+
		"\u00d4\n\u0002\u0000\u0000\u00d4\u00d8\u0005\u001a\u0000\u0000\u00d5\u00d6"+
		"\n\u0001\u0000\u0000\u00d6\u00d8\u0003\u0002\u0001\u0000\u00d7\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0011\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u0018\u0015\u001e"+
		")57C\\agiu\u0083\u008d\u0097\u009b\u00a1\u00a3\u00af\u00b1\u00bd\u00bf"+
		"\u00ce\u00d7\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}