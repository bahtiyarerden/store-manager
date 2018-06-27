// Generated from PQL.g4 by ANTLR 4.3
package tr.edu.ege.store_manager.query.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, OPEN_SQUARE_BRACKET=4, CLOSE_SQUARE_BRACKET=5, 
		OPEN_CURLY_BRACKET=6, CLOSE_CURLY_BRACKET=7, SCOL=8, DOT=9, OPEN_PAR=10, 
		CLOSE_PAR=11, COMMA=12, ASSIGN=13, STAR=14, PLUS=15, MINUS=16, TILDE=17, 
		PIPE2=18, DIV=19, MOD=20, LT2=21, GT2=22, AMP=23, PIPE=24, LT=25, LT_EQ=26, 
		GT=27, GT_EQ=28, EQ=29, NOT_EQ1=30, NOT_EQ2=31, K_ABORT=32, K_ACTION=33, 
		K_ADD=34, K_AFTER=35, K_ALL=36, K_ALTER=37, K_ANALYZE=38, K_AND=39, K_AS=40, 
		K_ASC=41, K_ATTACH=42, K_AUTOINCREMENT=43, K_BEFORE=44, K_BEGIN=45, K_BETWEEN=46, 
		K_BY=47, K_CASCADE=48, K_CASE=49, K_CAST=50, K_CHECK=51, K_COLLATE=52, 
		K_COLUMN=53, K_COMMIT=54, K_CONFLICT=55, K_CONSTRAINT=56, K_CREATE=57, 
		K_CROSS=58, K_CURRENT_DATE=59, K_CURRENT_TIME=60, K_CURRENT_TIMESTAMP=61, 
		K_DATABASE=62, K_DEFAULT=63, K_DEFERRABLE=64, K_DEFERRED=65, K_DELETE=66, 
		K_DESC=67, K_DETACH=68, K_DISTINCT=69, K_DROP=70, K_EACH=71, K_ELSE=72, 
		K_END=73, K_ESCAPE=74, K_EXCEPT=75, K_EXCLUSIVE=76, K_EXISTS=77, K_EXPLAIN=78, 
		K_FAIL=79, K_FOR=80, K_FOREIGN=81, K_FROM=82, K_FULL=83, K_GLOB=84, K_GROUP=85, 
		K_HAVING=86, K_IF=87, K_IGNORE=88, K_IMMEDIATE=89, K_IN=90, K_INDEX=91, 
		K_INDEXED=92, K_INITIALLY=93, K_INNER=94, K_INSERT=95, K_INSTEAD=96, K_INTERSECT=97, 
		K_INTO=98, K_IS=99, K_ISNULL=100, K_JOIN=101, K_KEY=102, K_LEFT=103, K_LIKE=104, 
		K_LIMIT=105, K_MATCH=106, K_NATURAL=107, K_NO=108, K_NOT=109, K_NOTNULL=110, 
		K_NULL=111, K_OF=112, K_OFFSET=113, K_ON=114, K_OR=115, K_ORDER=116, K_OUTER=117, 
		K_PLAN=118, K_PRAGMA=119, K_PRIMARY=120, K_QUERY=121, K_RAISE=122, K_RECURSIVE=123, 
		K_REFERENCES=124, K_REGEXP=125, K_REINDEX=126, K_RELEASE=127, K_RENAME=128, 
		K_REPLACE=129, K_RESTRICT=130, K_RIGHT=131, K_ROLLBACK=132, K_ROW=133, 
		K_SAVEPOINT=134, K_SELECT=135, K_SET=136, K_TABLE=137, K_TEMP=138, K_TEMPORARY=139, 
		K_THEN=140, K_TO=141, K_TRANSACTION=142, K_TRIGGER=143, K_UNION=144, K_UNIQUE=145, 
		K_UPDATE=146, K_USING=147, K_VACUUM=148, K_VALUES=149, K_VIEW=150, K_VIRTUAL=151, 
		K_WHEN=152, K_WHERE=153, K_WITH=154, K_WITHOUT=155, IDENTIFIER=156, NUMERIC_LITERAL=157, 
		BIND_PARAMETER=158, STRING_LITERAL=159, BLOB_LITERAL=160, SINGLE_LINE_COMMENT=161, 
		MULTILINE_COMMENT=162, WS=163, ANYTHING=164, UNEXPECTED_CHAR=165;
	public static final String[] tokenNames = {
		"<INVALID>", "'</sub>'", "'#'", "'<sub>'", "'['", "']'", "'{'", "'}'", 
		"';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", 
		"K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", 
		"K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", 
		"K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", 
		"K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", 
		"K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", 
		"K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", 
		"K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
		"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
		"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
		"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
		"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
		"K_MATCH", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
		"K_OFFSET", "K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", 
		"K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", 
		"K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", 
		"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", 
		"K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", 
		"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
		"K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
		"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "WS", "ANYTHING", "UNEXPECTED_CHAR"
	};
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt = 2, RULE_select_stmt = 3, 
		RULE_result_column = 4, RULE_alias = 5, RULE_subquery_stmt = 6, RULE_sub_query = 7, 
		RULE_sub_query_content = 8, RULE_database_name = 9, RULE_subjoin_stmt = 10, 
		RULE_join_pointer = 11, RULE_join_variable = 12, RULE_table_name = 13, 
		RULE_any_name = 14, RULE_error_message = 15, RULE_keyword = 16;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt", "select_stmt", "result_column", "alias", 
		"subquery_stmt", "sub_query", "sub_query_content", "database_name", "subjoin_stmt", 
		"join_pointer", "join_variable", "table_name", "any_name", "error_message", 
		"keyword"
	};

	@Override
	public String getGrammarFileName() { return "PQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public TerminalNode EOF() { return getToken(PQLParser.EOF, 0); }
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_SELECT || _la==UNEXPECTED_CHAR) {
				{
				setState(36);
				switch (_input.LA(1)) {
				case K_SELECT:
					{
					setState(34); sql_stmt();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(35); error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41); match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(PQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); ((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

				  	throw new RuntimeException("UNEXPECTED_CHAR="+ (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
				  
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(46); select_stmt();
			}
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Subjoin_stmtContext> subjoin_stmt() {
			return getRuleContexts(Subjoin_stmtContext.class);
		}
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(PQLParser.OPEN_CURLY_BRACKET); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(PQLParser.K_FROM, 0); }
		public List<Subquery_stmtContext> subquery_stmt() {
			return getRuleContexts(Subquery_stmtContext.class);
		}
		public TerminalNode K_JOIN() { return getToken(PQLParser.K_JOIN, 0); }
		public Subquery_stmtContext subquery_stmt(int i) {
			return getRuleContext(Subquery_stmtContext.class,i);
		}
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(PQLParser.OPEN_CURLY_BRACKET, i);
		}
		public Subjoin_stmtContext subjoin_stmt(int i) {
			return getRuleContext(Subjoin_stmtContext.class,i);
		}
		public TerminalNode K_SELECT() { return getToken(PQLParser.K_SELECT, 0); }
		public List<TerminalNode> K_AND() { return getTokens(PQLParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(PQLParser.K_AND, i);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(PQLParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(PQLParser.CLOSE_CURLY_BRACKET, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(K_SELECT);
			setState(49); result_column();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50); match(COMMA);
				setState(51); result_column();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(K_FROM);
			setState(58); match(OPEN_CURLY_BRACKET);
			setState(59); subquery_stmt();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60); match(COMMA);
				setState(61); subquery_stmt();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(CLOSE_CURLY_BRACKET);
			setState(80);
			_la = _input.LA(1);
			if (_la==K_JOIN) {
				{
				setState(68); match(K_JOIN);
				setState(69); match(OPEN_CURLY_BRACKET);
				setState(70); subjoin_stmt();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_AND) {
					{
					{
					setState(71); match(K_AND);
					setState(72); subjoin_stmt();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78); match(CLOSE_CURLY_BRACKET);
				}
			}

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

	public static class Result_columnContext extends ParserRuleContext {
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Join_variableContext join_variable() {
			return getRuleContext(Join_variableContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_result_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); alias();
			setState(83); match(DOT);
			setState(84); join_variable();
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

	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); any_name();
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

	public static class Subquery_stmtContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(PQLParser.K_AS, 0); }
		public Sub_queryContext sub_query() {
			return getRuleContext(Sub_queryContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Subquery_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSubquery_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSubquery_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSubquery_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_stmtContext subquery_stmt() throws RecognitionException {
		Subquery_stmtContext _localctx = new Subquery_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subquery_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(T__0);
			setState(89); sub_query();
			setState(90); match(T__2);
			setState(91); match(T__1);
			setState(92); database_name();
			setState(93); match(K_AS);
			setState(94); alias();
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

	public static class Sub_queryContext extends ParserRuleContext {
		public Sub_query_contentContext sub_query_content() {
			return getRuleContext(Sub_query_contentContext.class,0);
		}
		public Sub_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSub_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSub_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSub_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_queryContext sub_query() throws RecognitionException {
		Sub_queryContext _localctx = new Sub_queryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); sub_query_content();
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

	public static class Sub_query_contentContext extends ParserRuleContext {
		public Sub_query_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_query_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSub_query_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSub_query_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSub_query_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_query_contentContext sub_query_content() throws RecognitionException {
		Sub_query_contentContext _localctx = new Sub_query_contentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sub_query_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(98);
					matchWildcard();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); any_name();
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

	public static class Subjoin_stmtContext extends ParserRuleContext {
		public List<Join_pointerContext> join_pointer() {
			return getRuleContexts(Join_pointerContext.class);
		}
		public Join_pointerContext join_pointer(int i) {
			return getRuleContext(Join_pointerContext.class,i);
		}
		public Subjoin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjoin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSubjoin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSubjoin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSubjoin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subjoin_stmtContext subjoin_stmt() throws RecognitionException {
		Subjoin_stmtContext _localctx = new Subjoin_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subjoin_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); join_pointer();
			setState(107); match(ASSIGN);
			setState(108); join_pointer();
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

	public static class Join_pointerContext extends ParserRuleContext {
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Join_variableContext join_variable() {
			return getRuleContext(Join_variableContext.class,0);
		}
		public Join_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterJoin_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitJoin_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitJoin_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_pointerContext join_pointer() throws RecognitionException {
		Join_pointerContext _localctx = new Join_pointerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_join_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); alias();
			setState(111); match(DOT);
			setState(112); join_variable();
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

	public static class Join_variableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Join_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterJoin_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitJoin_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitJoin_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_variableContext join_variable() throws RecognitionException {
		Join_variableContext _localctx = new Join_variableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(PQLParser.NUMERIC_LITERAL, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PQLParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PQLParser.IDENTIFIER, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_any_name);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(121); match(OPEN_PAR);
				setState(122); any_name();
				setState(123); match(CLOSE_PAR);
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); match(NUMERIC_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(STRING_LITERAL);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(PQLParser.K_INDEXED, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(PQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_DETACH() { return getToken(PQLParser.K_DETACH, 0); }
		public TerminalNode K_CASCADE() { return getToken(PQLParser.K_CASCADE, 0); }
		public TerminalNode K_COLLATE() { return getToken(PQLParser.K_COLLATE, 0); }
		public TerminalNode K_VACUUM() { return getToken(PQLParser.K_VACUUM, 0); }
		public TerminalNode K_COLUMN() { return getToken(PQLParser.K_COLUMN, 0); }
		public TerminalNode K_DROP() { return getToken(PQLParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(PQLParser.K_VIEW, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(PQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(PQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(PQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(PQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEGIN() { return getToken(PQLParser.K_BEGIN, 0); }
		public TerminalNode K_OF() { return getToken(PQLParser.K_OF, 0); }
		public TerminalNode K_CROSS() { return getToken(PQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(PQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CREATE() { return getToken(PQLParser.K_CREATE, 0); }
		public TerminalNode K_IN() { return getToken(PQLParser.K_IN, 0); }
		public TerminalNode K_VALUES() { return getToken(PQLParser.K_VALUES, 0); }
		public TerminalNode K_UNION() { return getToken(PQLParser.K_UNION, 0); }
		public TerminalNode K_RAISE() { return getToken(PQLParser.K_RAISE, 0); }
		public TerminalNode K_ADD() { return getToken(PQLParser.K_ADD, 0); }
		public TerminalNode K_OFFSET() { return getToken(PQLParser.K_OFFSET, 0); }
		public TerminalNode K_REPLACE() { return getToken(PQLParser.K_REPLACE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(PQLParser.K_TRIGGER, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(PQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_DATABASE() { return getToken(PQLParser.K_DATABASE, 0); }
		public TerminalNode K_INSERT() { return getToken(PQLParser.K_INSERT, 0); }
		public TerminalNode K_LIMIT() { return getToken(PQLParser.K_LIMIT, 0); }
		public TerminalNode K_COMMIT() { return getToken(PQLParser.K_COMMIT, 0); }
		public TerminalNode K_EXISTS() { return getToken(PQLParser.K_EXISTS, 0); }
		public TerminalNode K_CONFLICT() { return getToken(PQLParser.K_CONFLICT, 0); }
		public TerminalNode K_DESC() { return getToken(PQLParser.K_DESC, 0); }
		public TerminalNode K_TEMP() { return getToken(PQLParser.K_TEMP, 0); }
		public TerminalNode K_TO() { return getToken(PQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(PQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_QUERY() { return getToken(PQLParser.K_QUERY, 0); }
		public TerminalNode K_IS() { return getToken(PQLParser.K_IS, 0); }
		public TerminalNode K_RELEASE() { return getToken(PQLParser.K_RELEASE, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(PQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_IGNORE() { return getToken(PQLParser.K_IGNORE, 0); }
		public TerminalNode K_SELECT() { return getToken(PQLParser.K_SELECT, 0); }
		public TerminalNode K_FOR() { return getToken(PQLParser.K_FOR, 0); }
		public TerminalNode K_EXCEPT() { return getToken(PQLParser.K_EXCEPT, 0); }
		public TerminalNode K_OR() { return getToken(PQLParser.K_OR, 0); }
		public TerminalNode K_BEFORE() { return getToken(PQLParser.K_BEFORE, 0); }
		public TerminalNode K_RENAME() { return getToken(PQLParser.K_RENAME, 0); }
		public TerminalNode K_INTO() { return getToken(PQLParser.K_INTO, 0); }
		public TerminalNode K_WHERE() { return getToken(PQLParser.K_WHERE, 0); }
		public TerminalNode K_INTERSECT() { return getToken(PQLParser.K_INTERSECT, 0); }
		public TerminalNode K_FROM() { return getToken(PQLParser.K_FROM, 0); }
		public TerminalNode K_EACH() { return getToken(PQLParser.K_EACH, 0); }
		public TerminalNode K_GLOB() { return getToken(PQLParser.K_GLOB, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(PQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_LEFT() { return getToken(PQLParser.K_LEFT, 0); }
		public TerminalNode K_FULL() { return getToken(PQLParser.K_FULL, 0); }
		public TerminalNode K_GROUP() { return getToken(PQLParser.K_GROUP, 0); }
		public TerminalNode K_REFERENCES() { return getToken(PQLParser.K_REFERENCES, 0); }
		public TerminalNode K_UPDATE() { return getToken(PQLParser.K_UPDATE, 0); }
		public TerminalNode K_ACTION() { return getToken(PQLParser.K_ACTION, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(PQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_END() { return getToken(PQLParser.K_END, 0); }
		public TerminalNode K_ASC() { return getToken(PQLParser.K_ASC, 0); }
		public TerminalNode K_THEN() { return getToken(PQLParser.K_THEN, 0); }
		public TerminalNode K_RESTRICT() { return getToken(PQLParser.K_RESTRICT, 0); }
		public TerminalNode K_FOREIGN() { return getToken(PQLParser.K_FOREIGN, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(PQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_INSTEAD() { return getToken(PQLParser.K_INSTEAD, 0); }
		public TerminalNode K_WITH() { return getToken(PQLParser.K_WITH, 0); }
		public TerminalNode K_ISNULL() { return getToken(PQLParser.K_ISNULL, 0); }
		public TerminalNode K_ORDER() { return getToken(PQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(PQLParser.K_OUTER, 0); }
		public TerminalNode K_SET() { return getToken(PQLParser.K_SET, 0); }
		public TerminalNode K_UNIQUE() { return getToken(PQLParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(PQLParser.K_KEY, 0); }
		public TerminalNode K_CAST() { return getToken(PQLParser.K_CAST, 0); }
		public TerminalNode K_NO() { return getToken(PQLParser.K_NO, 0); }
		public TerminalNode K_AFTER() { return getToken(PQLParser.K_AFTER, 0); }
		public TerminalNode K_PLAN() { return getToken(PQLParser.K_PLAN, 0); }
		public TerminalNode K_ROW() { return getToken(PQLParser.K_ROW, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(PQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_PRIMARY() { return getToken(PQLParser.K_PRIMARY, 0); }
		public TerminalNode K_ON() { return getToken(PQLParser.K_ON, 0); }
		public TerminalNode K_DISTINCT() { return getToken(PQLParser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(PQLParser.K_HAVING, 0); }
		public TerminalNode K_ALTER() { return getToken(PQLParser.K_ALTER, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(PQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_NOTNULL() { return getToken(PQLParser.K_NOTNULL, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PQLParser.K_DEFAULT, 0); }
		public TerminalNode K_INNER() { return getToken(PQLParser.K_INNER, 0); }
		public TerminalNode K_DELETE() { return getToken(PQLParser.K_DELETE, 0); }
		public TerminalNode K_RIGHT() { return getToken(PQLParser.K_RIGHT, 0); }
		public TerminalNode K_CASE() { return getToken(PQLParser.K_CASE, 0); }
		public TerminalNode K_MATCH() { return getToken(PQLParser.K_MATCH, 0); }
		public TerminalNode K_INITIALLY() { return getToken(PQLParser.K_INITIALLY, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(PQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_CHECK() { return getToken(PQLParser.K_CHECK, 0); }
		public TerminalNode K_NULL() { return getToken(PQLParser.K_NULL, 0); }
		public TerminalNode K_REINDEX() { return getToken(PQLParser.K_REINDEX, 0); }
		public TerminalNode K_BY() { return getToken(PQLParser.K_BY, 0); }
		public TerminalNode K_ABORT() { return getToken(PQLParser.K_ABORT, 0); }
		public TerminalNode K_WHEN() { return getToken(PQLParser.K_WHEN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(PQLParser.K_BETWEEN, 0); }
		public TerminalNode K_REGEXP() { return getToken(PQLParser.K_REGEXP, 0); }
		public TerminalNode K_IF() { return getToken(PQLParser.K_IF, 0); }
		public TerminalNode K_TABLE() { return getToken(PQLParser.K_TABLE, 0); }
		public TerminalNode K_LIKE() { return getToken(PQLParser.K_LIKE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(PQLParser.K_DEFERRED, 0); }
		public TerminalNode K_ANALYZE() { return getToken(PQLParser.K_ANALYZE, 0); }
		public TerminalNode K_JOIN() { return getToken(PQLParser.K_JOIN, 0); }
		public TerminalNode K_FAIL() { return getToken(PQLParser.K_FAIL, 0); }
		public TerminalNode K_PRAGMA() { return getToken(PQLParser.K_PRAGMA, 0); }
		public TerminalNode K_INDEX() { return getToken(PQLParser.K_INDEX, 0); }
		public TerminalNode K_AS() { return getToken(PQLParser.K_AS, 0); }
		public TerminalNode K_ELSE() { return getToken(PQLParser.K_ELSE, 0); }
		public TerminalNode K_ALL() { return getToken(PQLParser.K_ALL, 0); }
		public TerminalNode K_ATTACH() { return getToken(PQLParser.K_ATTACH, 0); }
		public TerminalNode K_AND() { return getToken(PQLParser.K_AND, 0); }
		public TerminalNode K_USING() { return getToken(PQLParser.K_USING, 0); }
		public TerminalNode K_WITHOUT() { return getToken(PQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NATURAL() { return getToken(PQLParser.K_NATURAL, 0); }
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(PQLParser.K_ESCAPE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (K_ABORT - 32)) | (1L << (K_ACTION - 32)) | (1L << (K_ADD - 32)) | (1L << (K_AFTER - 32)) | (1L << (K_ALL - 32)) | (1L << (K_ALTER - 32)) | (1L << (K_ANALYZE - 32)) | (1L << (K_AND - 32)) | (1L << (K_AS - 32)) | (1L << (K_ASC - 32)) | (1L << (K_ATTACH - 32)) | (1L << (K_AUTOINCREMENT - 32)) | (1L << (K_BEFORE - 32)) | (1L << (K_BEGIN - 32)) | (1L << (K_BETWEEN - 32)) | (1L << (K_BY - 32)) | (1L << (K_CASCADE - 32)) | (1L << (K_CASE - 32)) | (1L << (K_CAST - 32)) | (1L << (K_CHECK - 32)) | (1L << (K_COLLATE - 32)) | (1L << (K_COLUMN - 32)) | (1L << (K_COMMIT - 32)) | (1L << (K_CONFLICT - 32)) | (1L << (K_CONSTRAINT - 32)) | (1L << (K_CREATE - 32)) | (1L << (K_CROSS - 32)) | (1L << (K_CURRENT_DATE - 32)) | (1L << (K_CURRENT_TIME - 32)) | (1L << (K_CURRENT_TIMESTAMP - 32)) | (1L << (K_DATABASE - 32)) | (1L << (K_DEFAULT - 32)) | (1L << (K_DEFERRABLE - 32)) | (1L << (K_DEFERRED - 32)) | (1L << (K_DELETE - 32)) | (1L << (K_DESC - 32)) | (1L << (K_DETACH - 32)) | (1L << (K_DISTINCT - 32)) | (1L << (K_DROP - 32)) | (1L << (K_EACH - 32)) | (1L << (K_ELSE - 32)) | (1L << (K_END - 32)) | (1L << (K_ESCAPE - 32)) | (1L << (K_EXCEPT - 32)) | (1L << (K_EXCLUSIVE - 32)) | (1L << (K_EXISTS - 32)) | (1L << (K_EXPLAIN - 32)) | (1L << (K_FAIL - 32)) | (1L << (K_FOR - 32)) | (1L << (K_FOREIGN - 32)) | (1L << (K_FROM - 32)) | (1L << (K_FULL - 32)) | (1L << (K_GLOB - 32)) | (1L << (K_GROUP - 32)) | (1L << (K_HAVING - 32)) | (1L << (K_IF - 32)) | (1L << (K_IGNORE - 32)) | (1L << (K_IMMEDIATE - 32)) | (1L << (K_IN - 32)) | (1L << (K_INDEX - 32)) | (1L << (K_INDEXED - 32)) | (1L << (K_INITIALLY - 32)) | (1L << (K_INNER - 32)) | (1L << (K_INSERT - 32)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (K_INSTEAD - 96)) | (1L << (K_INTERSECT - 96)) | (1L << (K_INTO - 96)) | (1L << (K_IS - 96)) | (1L << (K_ISNULL - 96)) | (1L << (K_JOIN - 96)) | (1L << (K_KEY - 96)) | (1L << (K_LEFT - 96)) | (1L << (K_LIKE - 96)) | (1L << (K_LIMIT - 96)) | (1L << (K_MATCH - 96)) | (1L << (K_NATURAL - 96)) | (1L << (K_NO - 96)) | (1L << (K_NOT - 96)) | (1L << (K_NOTNULL - 96)) | (1L << (K_NULL - 96)) | (1L << (K_OF - 96)) | (1L << (K_OFFSET - 96)) | (1L << (K_ON - 96)) | (1L << (K_OR - 96)) | (1L << (K_ORDER - 96)) | (1L << (K_OUTER - 96)) | (1L << (K_PLAN - 96)) | (1L << (K_PRAGMA - 96)) | (1L << (K_PRIMARY - 96)) | (1L << (K_QUERY - 96)) | (1L << (K_RAISE - 96)) | (1L << (K_RECURSIVE - 96)) | (1L << (K_REFERENCES - 96)) | (1L << (K_REGEXP - 96)) | (1L << (K_REINDEX - 96)) | (1L << (K_RELEASE - 96)) | (1L << (K_RENAME - 96)) | (1L << (K_REPLACE - 96)) | (1L << (K_RESTRICT - 96)) | (1L << (K_RIGHT - 96)) | (1L << (K_ROLLBACK - 96)) | (1L << (K_ROW - 96)) | (1L << (K_SAVEPOINT - 96)) | (1L << (K_SELECT - 96)) | (1L << (K_SET - 96)) | (1L << (K_TABLE - 96)) | (1L << (K_TEMP - 96)) | (1L << (K_TEMPORARY - 96)) | (1L << (K_THEN - 96)) | (1L << (K_TO - 96)) | (1L << (K_TRANSACTION - 96)) | (1L << (K_TRIGGER - 96)) | (1L << (K_UNION - 96)) | (1L << (K_UNIQUE - 96)) | (1L << (K_UPDATE - 96)) | (1L << (K_USING - 96)) | (1L << (K_VACUUM - 96)) | (1L << (K_VALUES - 96)) | (1L << (K_VIEW - 96)) | (1L << (K_VIRTUAL - 96)) | (1L << (K_WHEN - 96)) | (1L << (K_WHERE - 96)) | (1L << (K_WITH - 96)) | (1L << (K_WITHOUT - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a7\u0087\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\5\5S"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\7\nf\n\n\f\n\16\ni\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0081"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3g\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\3\3\2\"\u009d\u0080\2(\3\2\2\2\4-\3\2\2\2\6\60\3\2\2\2\b\62"+
		"\3\2\2\2\nT\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20b\3\2\2\2\22g\3\2\2\2\24"+
		"j\3\2\2\2\26l\3\2\2\2\30p\3\2\2\2\32t\3\2\2\2\34v\3\2\2\2\36\u0080\3\2"+
		"\2\2 \u0082\3\2\2\2\"\u0084\3\2\2\2$\'\5\6\4\2%\'\5\4\3\2&$\3\2\2\2&%"+
		"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\2\2\3"+
		",\3\3\2\2\2-.\7\u00a7\2\2./\b\3\1\2/\5\3\2\2\2\60\61\5\b\5\2\61\7\3\2"+
		"\2\2\62\63\7\u0089\2\2\638\5\n\6\2\64\65\7\16\2\2\65\67\5\n\6\2\66\64"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7T\2"+
		"\2<=\7\b\2\2=B\5\16\b\2>?\7\16\2\2?A\5\16\b\2@>\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2ER\7\t\2\2FG\7g\2\2GH\7\b\2\2HM\5"+
		"\26\f\2IJ\7)\2\2JL\5\26\f\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP"+
		"\3\2\2\2OM\3\2\2\2PQ\7\t\2\2QS\3\2\2\2RF\3\2\2\2RS\3\2\2\2S\t\3\2\2\2"+
		"TU\5\f\7\2UV\7\13\2\2VW\5\32\16\2W\13\3\2\2\2XY\5\36\20\2Y\r\3\2\2\2Z"+
		"[\7\5\2\2[\\\5\20\t\2\\]\7\3\2\2]^\7\4\2\2^_\5\24\13\2_`\7*\2\2`a\5\f"+
		"\7\2a\17\3\2\2\2bc\5\22\n\2c\21\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2"+
		"gh\3\2\2\2ge\3\2\2\2h\23\3\2\2\2ig\3\2\2\2jk\5\36\20\2k\25\3\2\2\2lm\5"+
		"\30\r\2mn\7\17\2\2no\5\30\r\2o\27\3\2\2\2pq\5\f\7\2qr\7\13\2\2rs\5\32"+
		"\16\2s\31\3\2\2\2tu\5\36\20\2u\33\3\2\2\2vw\5\36\20\2w\35\3\2\2\2x\u0081"+
		"\7\u009e\2\2y\u0081\5\"\22\2z\u0081\7\u00a1\2\2{|\7\f\2\2|}\5\36\20\2"+
		"}~\7\r\2\2~\u0081\3\2\2\2\177\u0081\7\u009f\2\2\u0080x\3\2\2\2\u0080y"+
		"\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080\177\3\2\2\2\u0081\37\3\2"+
		"\2\2\u0082\u0083\7\u00a1\2\2\u0083!\3\2\2\2\u0084\u0085\t\2\2\2\u0085"+
		"#\3\2\2\2\n&(8BMRg\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}