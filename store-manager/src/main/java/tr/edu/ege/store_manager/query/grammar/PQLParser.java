package tr.edu.ege.store_manager.query.grammar;

// Generated from PQL.g4 by ANTLR 4.3
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
		T__0=1, OPEN_SQUARE_BRACKET=2, CLOSE_SQUARE_BRACKET=3, OPEN_CURLY_BRACKET=4, 
		CLOSE_CURLY_BRACKET=5, SCOL=6, DOT=7, OPEN_PAR=8, CLOSE_PAR=9, COMMA=10, 
		ASSIGN=11, STAR=12, PLUS=13, MINUS=14, TILDE=15, PIPE2=16, DIV=17, MOD=18, 
		LT2=19, GT2=20, AMP=21, PIPE=22, LT=23, LT_EQ=24, GT=25, GT_EQ=26, EQ=27, 
		NOT_EQ1=28, NOT_EQ2=29, K_ABORT=30, K_ACTION=31, K_ADD=32, K_AFTER=33, 
		K_ALL=34, K_ALTER=35, K_ANALYZE=36, K_AND=37, K_AS=38, K_ASC=39, K_ATTACH=40, 
		K_AUTOINCREMENT=41, K_BEFORE=42, K_BEGIN=43, K_BETWEEN=44, K_BY=45, K_CASCADE=46, 
		K_CASE=47, K_CAST=48, K_CHECK=49, K_COLLATE=50, K_COLUMN=51, K_COMMIT=52, 
		K_CONFLICT=53, K_CONSTRAINT=54, K_CREATE=55, K_CROSS=56, K_CURRENT_DATE=57, 
		K_CURRENT_TIME=58, K_CURRENT_TIMESTAMP=59, K_DATABASE=60, K_DEFAULT=61, 
		K_DEFERRABLE=62, K_DEFERRED=63, K_DELETE=64, K_DESC=65, K_DETACH=66, K_DISTINCT=67, 
		K_DROP=68, K_EACH=69, K_ELSE=70, K_END=71, K_ESCAPE=72, K_EXCEPT=73, K_EXCLUSIVE=74, 
		K_EXISTS=75, K_EXPLAIN=76, K_FAIL=77, K_FOR=78, K_FOREIGN=79, K_FROM=80, 
		K_FULL=81, K_GLOB=82, K_GROUP=83, K_HAVING=84, K_IF=85, K_IGNORE=86, K_IMMEDIATE=87, 
		K_IN=88, K_INDEX=89, K_INDEXED=90, K_INITIALLY=91, K_INNER=92, K_INSERT=93, 
		K_INSTEAD=94, K_INTERSECT=95, K_INTO=96, K_IS=97, K_ISNULL=98, K_JOIN=99, 
		K_KEY=100, K_LEFT=101, K_LIKE=102, K_LIMIT=103, K_MATCH=104, K_NATURAL=105, 
		K_NO=106, K_NOT=107, K_NOTNULL=108, K_NULL=109, K_OF=110, K_OFFSET=111, 
		K_ON=112, K_OR=113, K_ORDER=114, K_OUTER=115, K_PLAN=116, K_PRAGMA=117, 
		K_PRIMARY=118, K_QUERY=119, K_RAISE=120, K_RECURSIVE=121, K_REFERENCES=122, 
		K_REGEXP=123, K_REINDEX=124, K_RELEASE=125, K_RENAME=126, K_REPLACE=127, 
		K_RESTRICT=128, K_RIGHT=129, K_ROLLBACK=130, K_ROW=131, K_SAVEPOINT=132, 
		K_SELECT=133, K_SET=134, K_TABLE=135, K_TEMP=136, K_TEMPORARY=137, K_THEN=138, 
		K_TO=139, K_TRANSACTION=140, K_TRIGGER=141, K_UNION=142, K_UNIQUE=143, 
		K_UPDATE=144, K_USING=145, K_VACUUM=146, K_VALUES=147, K_VIEW=148, K_VIRTUAL=149, 
		K_WHEN=150, K_WHERE=151, K_WITH=152, K_WITHOUT=153, IDENTIFIER=154, NUMERIC_LITERAL=155, 
		BIND_PARAMETER=156, STRING_LITERAL=157, BLOB_LITERAL=158, SINGLE_LINE_COMMENT=159, 
		MULTILINE_COMMENT=160, SPACES=161, UNEXPECTED_CHAR=162;
	public static final String[] tokenNames = {
		"<INVALID>", "'#'", "'['", "']'", "'{'", "'}'", "';'", "'.'", "'('", "')'", 
		"','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", 
		"'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", 
		"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
		"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
		"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
		"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
	};
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt = 2, RULE_select_stmt = 3, 
		RULE_result_column = 4, RULE_subquery_stmt = 5, RULE_subjoin_stmt = 6, 
		RULE_join_pointer = 7, RULE_join_variable = 8, RULE_alias = 9, RULE_sub_query = 10, 
		RULE_database_name = 11, RULE_any_name = 12, RULE_column_def = 13, RULE_type_name = 14, 
		RULE_column_constraint = 15, RULE_conflict_clause = 16, RULE_expr = 17, 
		RULE_foreign_key_clause = 18, RULE_raise_function = 19, RULE_indexed_column = 20, 
		RULE_table_constraint = 21, RULE_with_clause = 22, RULE_qualified_table_name = 23, 
		RULE_ordering_term = 24, RULE_pragma_value = 25, RULE_common_table_expression = 26, 
		RULE_table_or_subquery = 27, RULE_join_clause = 28, RULE_join_operator = 29, 
		RULE_join_constraint = 30, RULE_compound_operator = 31, RULE_signed_number = 32, 
		RULE_literal_value = 33, RULE_unary_operator = 34, RULE_error_message = 35, 
		RULE_module_argument = 36, RULE_column_alias = 37, RULE_keyword = 38, 
		RULE_name = 39, RULE_function_name = 40, RULE_schema_name = 41, RULE_table_function_name = 42, 
		RULE_table_name = 43, RULE_table_or_index_name = 44, RULE_new_table_name = 45, 
		RULE_column_name = 46, RULE_collation_name = 47, RULE_foreign_table = 48, 
		RULE_index_name = 49, RULE_trigger_name = 50, RULE_view_name = 51, RULE_module_name = 52, 
		RULE_pragma_name = 53, RULE_savepoint_name = 54, RULE_table_alias = 55, 
		RULE_transaction_name = 56;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt", "select_stmt", "result_column", "subquery_stmt", 
		"subjoin_stmt", "join_pointer", "join_variable", "alias", "sub_query", 
		"database_name", "any_name", "column_def", "type_name", "column_constraint", 
		"conflict_clause", "expr", "foreign_key_clause", "raise_function", "indexed_column", 
		"table_constraint", "with_clause", "qualified_table_name", "ordering_term", 
		"pragma_value", "common_table_expression", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "compound_operator", "signed_number", 
		"literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "schema_name", "table_function_name", 
		"table_name", "table_or_index_name", "new_table_name", "column_name", 
		"collation_name", "foreign_table", "index_name", "trigger_name", "view_name", 
		"module_name", "pragma_name", "savepoint_name", "table_alias", "transaction_name"
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_SELECT || _la==UNEXPECTED_CHAR) {
				{
				setState(116);
				switch (_input.LA(1)) {
				case K_SELECT:
					{
					setState(114); sql_stmt();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(115); error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(EOF);
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
			setState(123); ((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

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
			setState(126); select_stmt();
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
			setState(128); match(K_SELECT);
			setState(129); result_column();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130); match(COMMA);
				setState(131); result_column();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); match(K_FROM);
			setState(138); match(OPEN_CURLY_BRACKET);
			setState(139); subquery_stmt();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140); match(COMMA);
				setState(141); subquery_stmt();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(CLOSE_CURLY_BRACKET);
			setState(160);
			_la = _input.LA(1);
			if (_la==K_JOIN) {
				{
				setState(148); match(K_JOIN);
				setState(149); match(OPEN_CURLY_BRACKET);
				setState(150); subjoin_stmt();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_AND) {
					{
					{
					setState(151); match(K_AND);
					setState(152); subjoin_stmt();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158); match(CLOSE_CURLY_BRACKET);
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
			setState(162); alias();
			setState(163); match(DOT);
			setState(164); join_variable();
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
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(PQLParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(PQLParser.CLOSE_SQUARE_BRACKET, 0); }
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
		enterRule(_localctx, 10, RULE_subquery_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(OPEN_SQUARE_BRACKET);
			setState(167); sub_query();
			setState(168); match(CLOSE_SQUARE_BRACKET);
			setState(169); match(T__0);
			setState(170); database_name();
			setState(171); match(K_AS);
			setState(172); alias();
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
		enterRule(_localctx, 12, RULE_subjoin_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); join_pointer();
			setState(175); match(ASSIGN);
			setState(176); join_pointer();
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
		enterRule(_localctx, 14, RULE_join_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); alias();
			setState(179); match(DOT);
			setState(180); join_variable();
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
		enterRule(_localctx, 16, RULE_join_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); any_name();
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
		enterRule(_localctx, 18, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); any_name();
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
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
		enterRule(_localctx, 20, RULE_sub_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); any_name();
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
		enterRule(_localctx, 22, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); any_name();
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
		enterRule(_localctx, 24, RULE_any_name);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); match(IDENTIFIER);
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
				setState(191); keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(193); match(OPEN_PAR);
				setState(194); any_name();
				setState(195); match(CLOSE_PAR);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); column_name();
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(200); type_name();
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (K_NOT - 107)) | (1L << (K_NULL - 107)) | (1L << (K_PRIMARY - 107)) | (1L << (K_REFERENCES - 107)) | (1L << (K_UNIQUE - 107)))) != 0)) {
				{
				{
				setState(203); column_constraint();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(209); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(214); match(OPEN_PAR);
				setState(215); signed_number();
				setState(216); match(CLOSE_PAR);
				}
				break;

			case 2:
				{
				setState(218); match(OPEN_PAR);
				setState(219); signed_number();
				setState(220); match(COMMA);
				setState(221); signed_number();
				setState(222); match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_COLLATE() { return getToken(PQLParser.K_COLLATE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PQLParser.K_DEFAULT, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(PQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_DESC() { return getToken(PQLParser.K_DESC, 0); }
		public TerminalNode K_PRIMARY() { return getToken(PQLParser.K_PRIMARY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(PQLParser.K_CHECK, 0); }
		public TerminalNode K_NULL() { return getToken(PQLParser.K_NULL, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(PQLParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(PQLParser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(PQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(PQLParser.K_ASC, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(226); match(K_CONSTRAINT);
				setState(227); name();
				}
			}

			setState(263);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(230); match(K_PRIMARY);
				setState(231); match(K_KEY);
				setState(233);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(232);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(235); conflict_clause();
				setState(237);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(236); match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(240);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(239); match(K_NOT);
					}
				}

				setState(242); match(K_NULL);
				setState(243); conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(244); match(K_UNIQUE);
				setState(245); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(246); match(K_CHECK);
				setState(247); match(OPEN_PAR);
				setState(248); expr(0);
				setState(249); match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(251); match(K_DEFAULT);
				setState(258);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(252); signed_number();
					}
					break;

				case 2:
					{
					setState(253); literal_value();
					}
					break;

				case 3:
					{
					setState(254); match(OPEN_PAR);
					setState(255); expr(0);
					setState(256); match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(260); match(K_COLLATE);
				setState(261); collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(262); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(PQLParser.K_ON, 0); }
		public TerminalNode K_IGNORE() { return getToken(PQLParser.K_IGNORE, 0); }
		public TerminalNode K_CONFLICT() { return getToken(PQLParser.K_CONFLICT, 0); }
		public TerminalNode K_ABORT() { return getToken(PQLParser.K_ABORT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(PQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(PQLParser.K_FAIL, 0); }
		public TerminalNode K_REPLACE() { return getToken(PQLParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(265); match(K_ON);
				setState(266); match(K_CONFLICT);
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_FAIL - 77)) | (1L << (K_IGNORE - 77)) | (1L << (K_REPLACE - 77)) | (1L << (K_ROLLBACK - 77)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(PQLParser.BIND_PARAMETER, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PQLParser.K_COLLATE, 0); }
		public TerminalNode K_EXISTS() { return getToken(PQLParser.K_EXISTS, 0); }
		public TerminalNode K_CASE() { return getToken(PQLParser.K_CASE, 0); }
		public TerminalNode K_MATCH() { return getToken(PQLParser.K_MATCH, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(PQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(PQLParser.K_ISNULL, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(PQLParser.K_NULL, 0); }
		public TerminalNode K_OR() { return getToken(PQLParser.K_OR, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(PQLParser.K_WHEN); }
		public TerminalNode K_BETWEEN() { return getToken(PQLParser.K_BETWEEN, 0); }
		public TerminalNode K_THEN(int i) {
			return getToken(PQLParser.K_THEN, i);
		}
		public TerminalNode K_CAST() { return getToken(PQLParser.K_CAST, 0); }
		public TerminalNode K_REGEXP() { return getToken(PQLParser.K_REGEXP, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode K_WHEN(int i) {
			return getToken(PQLParser.K_WHEN, i);
		}
		public TerminalNode K_LIKE() { return getToken(PQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(PQLParser.K_GLOB, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PQLParser.K_AS, 0); }
		public TerminalNode K_ELSE() { return getToken(PQLParser.K_ELSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(PQLParser.K_DISTINCT, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(PQLParser.K_IN, 0); }
		public TerminalNode K_AND() { return getToken(PQLParser.K_AND, 0); }
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(PQLParser.K_ESCAPE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_END() { return getToken(PQLParser.K_END, 0); }
		public TerminalNode K_NOTNULL() { return getToken(PQLParser.K_NOTNULL, 0); }
		public List<TerminalNode> K_THEN() { return getTokens(PQLParser.K_THEN); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(271); unary_operator();
				setState(272); expr(21);
				}
				break;

			case 2:
				{
				setState(274); literal_value();
				}
				break;

			case 3:
				{
				setState(275); match(BIND_PARAMETER);
				}
				break;

			case 4:
				{
				setState(284);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(279);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(276); database_name();
						setState(277); match(DOT);
						}
						break;
					}
					setState(281); table_name();
					setState(282); match(DOT);
					}
					break;
				}
				setState(286); column_name();
				}
				break;

			case 5:
				{
				setState(287); function_name();
				setState(288); match(OPEN_PAR);
				setState(301);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
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
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(290);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(289); match(K_DISTINCT);
						}
						break;
					}
					setState(292); expr(0);
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(293); match(COMMA);
						setState(294); expr(0);
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(300); match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(303); match(CLOSE_PAR);
				}
				break;

			case 6:
				{
				setState(305); match(OPEN_PAR);
				setState(306); expr(0);
				setState(307); match(CLOSE_PAR);
				}
				break;

			case 7:
				{
				setState(309); match(K_CAST);
				setState(310); match(OPEN_PAR);
				setState(311); expr(0);
				setState(312); match(K_AS);
				setState(313); type_name();
				setState(314); match(CLOSE_PAR);
				}
				break;

			case 8:
				{
				setState(320);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(317);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(316); match(K_NOT);
						}
					}

					setState(319); match(K_EXISTS);
					}
				}

				setState(322); match(OPEN_PAR);
				setState(323); select_stmt();
				setState(324); match(CLOSE_PAR);
				}
				break;

			case 9:
				{
				setState(326); match(K_CASE);
				setState(328);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(327); expr(0);
					}
					break;
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330); match(K_WHEN);
					setState(331); expr(0);
					setState(332); match(K_THEN);
					setState(333); expr(0);
					}
					}
					setState(337); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(341);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(339); match(K_ELSE);
					setState(340); expr(0);
					}
				}

				setState(343); match(K_END);
				}
				break;

			case 10:
				{
				setState(345); raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(349); match(PIPE2);
						setState(350); expr(21);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(352);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(353); expr(20);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(355);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(356); expr(19);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(358);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(359); expr(18);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(361);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(362); expr(17);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(364);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(365); expr(16);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(367); match(K_AND);
						setState(368); expr(14);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(370); match(K_OR);
						setState(371); expr(13);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(373); match(K_IS);
						setState(375);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(374); match(K_NOT);
							}
							break;
						}
						setState(377); expr(6);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(380);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(379); match(K_NOT);
							}
						}

						setState(382); match(K_BETWEEN);
						setState(383); expr(0);
						setState(384); match(K_AND);
						setState(385); expr(5);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(387);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(389);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(388); match(K_NOT);
							}
						}

						setState(391); match(K_IN);
						setState(411);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(392); match(OPEN_PAR);
							setState(402);
							switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
							case 1:
								{
								setState(393); select_stmt();
								}
								break;

							case 2:
								{
								setState(394); expr(0);
								setState(399);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(395); match(COMMA);
									setState(396); expr(0);
									}
									}
									setState(401);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(404); match(CLOSE_PAR);
							}
							break;

						case 2:
							{
							setState(408);
							switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
							case 1:
								{
								setState(405); database_name();
								setState(406); match(DOT);
								}
								break;
							}
							setState(410); table_name();
							}
							break;
						}
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(413);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(414); match(K_COLLATE);
						setState(415); collation_name();
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(416);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(418);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(417); match(K_NOT);
							}
						}

						setState(420);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(421); expr(0);
						setState(424);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(422); match(K_ESCAPE);
							setState(423); expr(0);
							}
							break;
						}
						}
						break;

					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(426);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(431);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(427); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(428); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(429); match(K_NOT);
							setState(430); match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(PQLParser.K_RESTRICT); }
		public TerminalNode K_NO(int i) {
			return getToken(PQLParser.K_NO, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(PQLParser.K_CASCADE); }
		public List<TerminalNode> K_DEFAULT() { return getTokens(PQLParser.K_DEFAULT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(PQLParser.K_RESTRICT, i);
		}
		public TerminalNode K_ACTION(int i) {
			return getToken(PQLParser.K_ACTION, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(PQLParser.K_DELETE); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(PQLParser.K_DEFAULT, i);
		}
		public TerminalNode K_SET(int i) {
			return getToken(PQLParser.K_SET, i);
		}
		public TerminalNode K_ON(int i) {
			return getToken(PQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(PQLParser.K_MATCH); }
		public TerminalNode K_INITIALLY() { return getToken(PQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(PQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(PQLParser.K_SET); }
		public List<TerminalNode> K_NULL() { return getTokens(PQLParser.K_NULL); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public TerminalNode K_NULL(int i) {
			return getToken(PQLParser.K_NULL, i);
		}
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode K_DELETE(int i) {
			return getToken(PQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(PQLParser.K_NO); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(PQLParser.K_UPDATE, i);
		}
		public TerminalNode K_DEFERRED() { return getToken(PQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(PQLParser.K_IMMEDIATE, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> K_ON() { return getTokens(PQLParser.K_ON); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REFERENCES() { return getToken(PQLParser.K_REFERENCES, 0); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(PQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(PQLParser.K_UPDATE); }
		public TerminalNode K_MATCH(int i) {
			return getToken(PQLParser.K_MATCH, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(PQLParser.K_ACTION); }
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); match(K_REFERENCES);
			setState(439); foreign_table();
			setState(451);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(440); match(OPEN_PAR);
				setState(441); column_name();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(442); match(COMMA);
					setState(443); column_name();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449); match(CLOSE_PAR);
				}
			}

			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(467);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(453); match(K_ON);
					setState(454);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(463);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(455); match(K_SET);
						setState(456); match(K_NULL);
						}
						break;

					case 2:
						{
						setState(457); match(K_SET);
						setState(458); match(K_DEFAULT);
						}
						break;

					case 3:
						{
						setState(459); match(K_CASCADE);
						}
						break;

					case 4:
						{
						setState(460); match(K_RESTRICT);
						}
						break;

					case 5:
						{
						setState(461); match(K_NO);
						setState(462); match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(465); match(K_MATCH);
					setState(466); name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(475);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(474); match(K_NOT);
					}
				}

				setState(477); match(K_DEFERRABLE);
				setState(482);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(478); match(K_INITIALLY);
					setState(479); match(K_DEFERRED);
					}
					break;

				case 2:
					{
					setState(480); match(K_INITIALLY);
					setState(481); match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
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

	public static class Raise_functionContext extends ParserRuleContext {
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_IGNORE() { return getToken(PQLParser.K_IGNORE, 0); }
		public TerminalNode K_ABORT() { return getToken(PQLParser.K_ABORT, 0); }
		public TerminalNode K_RAISE() { return getToken(PQLParser.K_RAISE, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(PQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(PQLParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(K_RAISE);
			setState(487); match(OPEN_PAR);
			setState(492);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(488); match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(490); match(COMMA);
				setState(491); error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(494); match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PQLParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(PQLParser.K_DESC, 0); }
		public TerminalNode K_ASC() { return getToken(PQLParser.K_ASC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); column_name();
			setState(499);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(497); match(K_COLLATE);
				setState(498); collation_name();
				}
			}

			setState(502);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public TerminalNode K_FOREIGN() { return getToken(PQLParser.K_FOREIGN, 0); }
		public TerminalNode K_PRIMARY() { return getToken(PQLParser.K_PRIMARY, 0); }
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_CHECK() { return getToken(PQLParser.K_CHECK, 0); }
		public TerminalNode K_UNIQUE() { return getToken(PQLParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(PQLParser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(PQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(504); match(K_CONSTRAINT);
				setState(505); name();
				}
			}

			setState(544);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(511);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(508); match(K_PRIMARY);
					setState(509); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(510); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(513); match(OPEN_PAR);
				setState(514); indexed_column();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(515); match(COMMA);
					setState(516); indexed_column();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522); match(CLOSE_PAR);
				setState(523); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(525); match(K_CHECK);
				setState(526); match(OPEN_PAR);
				setState(527); expr(0);
				setState(528); match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(530); match(K_FOREIGN);
				setState(531); match(K_KEY);
				setState(532); match(OPEN_PAR);
				setState(533); column_name();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(534); match(COMMA);
					setState(535); column_name();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541); match(CLOSE_PAR);
				setState(542); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(PQLParser.K_WITH, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(PQLParser.K_RECURSIVE, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546); match(K_WITH);
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(547); match(K_RECURSIVE);
				}
				break;
			}
			setState(550); common_table_expression();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(551); match(COMMA);
				setState(552); common_table_expression();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(PQLParser.K_INDEXED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(PQLParser.K_BY, 0); }
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(558); database_name();
				setState(559); match(DOT);
				}
				break;
			}
			setState(563); table_name();
			setState(569);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(564); match(K_INDEXED);
				setState(565); match(K_BY);
				setState(566); index_name();
				}
				break;
			case K_NOT:
				{
				setState(567); match(K_NOT);
				setState(568); match(K_INDEXED);
				}
				break;
			case EOF:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PQLParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(PQLParser.K_DESC, 0); }
		public TerminalNode K_ASC() { return getToken(PQLParser.K_ASC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); expr(0);
			setState(574);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(572); match(K_COLLATE);
				setState(573); collation_name();
				}
			}

			setState(577);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PQLParser.STRING_LITERAL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pragma_value);
		try {
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579); signed_number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581); match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(PQLParser.K_AS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); table_name();
			setState(596);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(585); match(OPEN_PAR);
				setState(586); column_name();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(587); match(COMMA);
					setState(588); column_name();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594); match(CLOSE_PAR);
				}
			}

			setState(598); match(K_AS);
			setState(599); match(OPEN_PAR);
			setState(600); select_stmt();
			setState(601); match(CLOSE_PAR);
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(PQLParser.K_INDEXED, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PQLParser.K_AS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_BY() { return getToken(PQLParser.K_BY, 0); }
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_or_subquery);
		int _la;
		try {
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(603); schema_name();
					setState(604); match(DOT);
					}
					break;
				}
				setState(608); table_name();
				setState(613);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(610);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(609); match(K_AS);
						}
					}

					setState(612); table_alias();
					}
				}

				setState(620);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(615); match(K_INDEXED);
					setState(616); match(K_BY);
					setState(617); index_name();
					}
					break;
				case K_NOT:
					{
					setState(618); match(K_NOT);
					setState(619); match(K_INDEXED);
					}
					break;
				case CLOSE_PAR:
				case COMMA:
				case K_CROSS:
				case K_INNER:
				case K_JOIN:
				case K_LEFT:
				case K_NATURAL:
				case K_ON:
				case K_USING:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(622); schema_name();
					setState(623); match(DOT);
					}
					break;
				}
				setState(627); table_function_name();
				setState(628); match(OPEN_PAR);
				setState(637);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					setState(629); expr(0);
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(630); match(COMMA);
						setState(631); expr(0);
						}
						}
						setState(636);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(639); match(CLOSE_PAR);
				setState(644);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(641);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(640); match(K_AS);
						}
					}

					setState(643); table_alias();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(646); match(OPEN_PAR);
				setState(656);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(647); table_or_subquery();
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(648); match(COMMA);
						setState(649); table_or_subquery();
						}
						}
						setState(654);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;

				case 2:
					{
					setState(655); join_clause();
					}
					break;
				}
				setState(658); match(CLOSE_PAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(660); match(OPEN_PAR);
				setState(661); select_stmt();
				setState(662); match(CLOSE_PAR);
				setState(667);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(664);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(663); match(K_AS);
						}
					}

					setState(666); table_alias();
					}
				}

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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); table_or_subquery();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_INNER - 92)) | (1L << (K_JOIN - 92)) | (1L << (K_LEFT - 92)) | (1L << (K_NATURAL - 92)))) != 0)) {
				{
				{
				setState(672); join_operator();
				setState(673); table_or_subquery();
				setState(674); join_constraint();
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_CROSS() { return getToken(PQLParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(PQLParser.K_OUTER, 0); }
		public TerminalNode K_INNER() { return getToken(PQLParser.K_INNER, 0); }
		public TerminalNode K_NATURAL() { return getToken(PQLParser.K_NATURAL, 0); }
		public TerminalNode K_JOIN() { return getToken(PQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(PQLParser.K_LEFT, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_join_operator);
		int _la;
		try {
			setState(694);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(682); match(K_NATURAL);
					}
				}

				setState(691);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(685); match(K_LEFT);
					setState(687);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(686); match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(689); match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(690); match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(693); match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(PQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_USING() { return getToken(PQLParser.K_USING, 0); }
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(696); match(K_ON);
				setState(697); expr(0);
				}
				break;
			case K_USING:
				{
				setState(698); match(K_USING);
				setState(699); match(OPEN_PAR);
				setState(700); column_name();
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(701); match(COMMA);
					setState(702); column_name();
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708); match(CLOSE_PAR);
				}
				break;
			case CLOSE_PAR:
			case COMMA:
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_ALL() { return getToken(PQLParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(PQLParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(PQLParser.K_EXCEPT, 0); }
		public TerminalNode K_UNION() { return getToken(PQLParser.K_UNION, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compound_operator);
		try {
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712); match(K_UNION);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713); match(K_UNION);
				setState(714); match(K_ALL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715); match(K_INTERSECT);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716); match(K_EXCEPT);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(PQLParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(719);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(722); match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode K_CURRENT_DATE() { return getToken(PQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(PQLParser.K_NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PQLParser.STRING_LITERAL, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(PQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(PQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(PQLParser.BLOB_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (K_NULL - 109)) | (1L << (NUMERIC_LITERAL - 109)) | (1L << (STRING_LITERAL - 109)) | (1L << (BLOB_LITERAL - 109)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(PQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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
		enterRule(_localctx, 70, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_module_argument);
		try {
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730); expr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PQLParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PQLParser.IDENTIFIER, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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
		enterRule(_localctx, 76, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ABORT - 30)) | (1L << (K_ACTION - 30)) | (1L << (K_ADD - 30)) | (1L << (K_AFTER - 30)) | (1L << (K_ALL - 30)) | (1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_AND - 30)) | (1L << (K_AS - 30)) | (1L << (K_ASC - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_AUTOINCREMENT - 30)) | (1L << (K_BEFORE - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_BETWEEN - 30)) | (1L << (K_BY - 30)) | (1L << (K_CASCADE - 30)) | (1L << (K_CASE - 30)) | (1L << (K_CAST - 30)) | (1L << (K_CHECK - 30)) | (1L << (K_COLLATE - 30)) | (1L << (K_COLUMN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CONFLICT - 30)) | (1L << (K_CONSTRAINT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_CROSS - 30)) | (1L << (K_CURRENT_DATE - 30)) | (1L << (K_CURRENT_TIME - 30)) | (1L << (K_CURRENT_TIMESTAMP - 30)) | (1L << (K_DATABASE - 30)) | (1L << (K_DEFAULT - 30)) | (1L << (K_DEFERRABLE - 30)) | (1L << (K_DEFERRED - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DESC - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DISTINCT - 30)) | (1L << (K_DROP - 30)) | (1L << (K_EACH - 30)) | (1L << (K_ELSE - 30)) | (1L << (K_END - 30)) | (1L << (K_ESCAPE - 30)) | (1L << (K_EXCEPT - 30)) | (1L << (K_EXCLUSIVE - 30)) | (1L << (K_EXISTS - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_FAIL - 30)) | (1L << (K_FOR - 30)) | (1L << (K_FOREIGN - 30)) | (1L << (K_FROM - 30)) | (1L << (K_FULL - 30)) | (1L << (K_GLOB - 30)) | (1L << (K_GROUP - 30)) | (1L << (K_HAVING - 30)) | (1L << (K_IF - 30)) | (1L << (K_IGNORE - 30)) | (1L << (K_IMMEDIATE - 30)) | (1L << (K_IN - 30)) | (1L << (K_INDEX - 30)) | (1L << (K_INDEXED - 30)) | (1L << (K_INITIALLY - 30)) | (1L << (K_INNER - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INSTEAD - 94)) | (1L << (K_INTERSECT - 94)) | (1L << (K_INTO - 94)) | (1L << (K_IS - 94)) | (1L << (K_ISNULL - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_KEY - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_LIKE - 94)) | (1L << (K_LIMIT - 94)) | (1L << (K_MATCH - 94)) | (1L << (K_NATURAL - 94)) | (1L << (K_NO - 94)) | (1L << (K_NOT - 94)) | (1L << (K_NOTNULL - 94)) | (1L << (K_NULL - 94)) | (1L << (K_OF - 94)) | (1L << (K_OFFSET - 94)) | (1L << (K_ON - 94)) | (1L << (K_OR - 94)) | (1L << (K_ORDER - 94)) | (1L << (K_OUTER - 94)) | (1L << (K_PLAN - 94)) | (1L << (K_PRAGMA - 94)) | (1L << (K_PRIMARY - 94)) | (1L << (K_QUERY - 94)) | (1L << (K_RAISE - 94)) | (1L << (K_RECURSIVE - 94)) | (1L << (K_REFERENCES - 94)) | (1L << (K_REGEXP - 94)) | (1L << (K_REINDEX - 94)) | (1L << (K_RELEASE - 94)) | (1L << (K_RENAME - 94)) | (1L << (K_REPLACE - 94)) | (1L << (K_RESTRICT - 94)) | (1L << (K_RIGHT - 94)) | (1L << (K_ROLLBACK - 94)) | (1L << (K_ROW - 94)) | (1L << (K_SAVEPOINT - 94)) | (1L << (K_SELECT - 94)) | (1L << (K_SET - 94)) | (1L << (K_TABLE - 94)) | (1L << (K_TEMP - 94)) | (1L << (K_TEMPORARY - 94)) | (1L << (K_THEN - 94)) | (1L << (K_TO - 94)) | (1L << (K_TRANSACTION - 94)) | (1L << (K_TRIGGER - 94)) | (1L << (K_UNION - 94)) | (1L << (K_UNIQUE - 94)) | (1L << (K_UPDATE - 94)) | (1L << (K_USING - 94)) | (1L << (K_VACUUM - 94)) | (1L << (K_VALUES - 94)) | (1L << (K_VIEW - 94)) | (1L << (K_VIRTUAL - 94)) | (1L << (K_WHEN - 94)) | (1L << (K_WHERE - 94)) | (1L << (K_WITH - 94)) | (1L << (K_WITHOUT - 94)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); any_name();
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

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742); any_name();
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

	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTable_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTable_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTable_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); any_name();
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
		enterRule(_localctx, 86, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762); any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764); any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768); any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PQLParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PQLParser.IDENTIFIER, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_alias);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(770); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(771); match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(772); match(OPEN_PAR);
				setState(773); table_alias();
				setState(774); match(CLOSE_PAR);
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PQLListener ) ((PQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PQLVisitor ) return ((PQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); any_name();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 20);

		case 1: return precpred(_ctx, 19);

		case 2: return precpred(_ctx, 18);

		case 3: return precpred(_ctx, 17);

		case 4: return precpred(_ctx, 16);

		case 5: return precpred(_ctx, 15);

		case 6: return precpred(_ctx, 13);

		case 7: return precpred(_ctx, 12);

		case 8: return precpred(_ctx, 5);

		case 9: return precpred(_ctx, 4);

		case 10: return precpred(_ctx, 14);

		case 11: return precpred(_ctx, 8);

		case 12: return precpred(_ctx, 7);

		case 13: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a4\u030f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\7\2w\n\2\f"+
		"\2\16\2z\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0087\n"+
		"\5\f\5\16\5\u008a\13\5\3\5\3\5\3\5\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009c\n\5\f\5\16\5\u009f\13\5\3\5\3"+
		"\5\5\5\u00a3\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\5\17\u00cc\n\17\3"+
		"\17\7\17\u00cf\n\17\f\17\16\17\u00d2\13\17\3\20\6\20\u00d5\n\20\r\20\16"+
		"\20\u00d6\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e3"+
		"\n\20\3\21\3\21\5\21\u00e7\n\21\3\21\3\21\3\21\5\21\u00ec\n\21\3\21\3"+
		"\21\5\21\u00f0\n\21\3\21\5\21\u00f3\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0105\n\21\3\21"+
		"\3\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\5\22\u010f\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011a\n\23\3\23\3\23\3\23\5\23"+
		"\u011f\n\23\3\23\3\23\3\23\3\23\5\23\u0125\n\23\3\23\3\23\3\23\7\23\u012a"+
		"\n\23\f\23\16\23\u012d\13\23\3\23\5\23\u0130\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0140\n\23\3\23"+
		"\5\23\u0143\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014b\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\6\23\u0152\n\23\r\23\16\23\u0153\3\23\3\23\5\23\u0158"+
		"\n\23\3\23\3\23\3\23\5\23\u015d\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u017a\n\23\3\23\3\23\3\23\5\23\u017f"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0188\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0190\n\23\f\23\16\23\u0193\13\23\5\23\u0195\n\23"+
		"\3\23\3\23\3\23\3\23\5\23\u019b\n\23\3\23\5\23\u019e\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u01a5\n\23\3\23\3\23\3\23\3\23\5\23\u01ab\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u01b2\n\23\7\23\u01b4\n\23\f\23\16\23\u01b7"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01bf\n\24\f\24\16\24\u01c2"+
		"\13\24\3\24\3\24\5\24\u01c6\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u01d2\n\24\3\24\3\24\5\24\u01d6\n\24\7\24\u01d8\n\24"+
		"\f\24\16\24\u01db\13\24\3\24\5\24\u01de\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01e5\n\24\5\24\u01e7\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01ef"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u01f6\n\26\3\26\5\26\u01f9\n\26\3"+
		"\27\3\27\5\27\u01fd\n\27\3\27\3\27\3\27\5\27\u0202\n\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0208\n\27\f\27\16\27\u020b\13\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u021b\n\27\f\27\16"+
		"\27\u021e\13\27\3\27\3\27\3\27\5\27\u0223\n\27\3\30\3\30\5\30\u0227\n"+
		"\30\3\30\3\30\3\30\7\30\u022c\n\30\f\30\16\30\u022f\13\30\3\31\3\31\3"+
		"\31\5\31\u0234\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u023c\n\31\3\32"+
		"\3\32\3\32\5\32\u0241\n\32\3\32\5\32\u0244\n\32\3\33\3\33\3\33\5\33\u0249"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u0250\n\34\f\34\16\34\u0253\13\34"+
		"\3\34\3\34\5\34\u0257\n\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u0261\n\35\3\35\3\35\5\35\u0265\n\35\3\35\5\35\u0268\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u026f\n\35\3\35\3\35\3\35\5\35\u0274\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u027b\n\35\f\35\16\35\u027e\13\35\5\35\u0280\n\35"+
		"\3\35\3\35\5\35\u0284\n\35\3\35\5\35\u0287\n\35\3\35\3\35\3\35\3\35\7"+
		"\35\u028d\n\35\f\35\16\35\u0290\13\35\3\35\5\35\u0293\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u029b\n\35\3\35\5\35\u029e\n\35\5\35\u02a0\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u02a7\n\36\f\36\16\36\u02aa\13\36\3\37"+
		"\3\37\5\37\u02ae\n\37\3\37\3\37\5\37\u02b2\n\37\3\37\3\37\5\37\u02b6\n"+
		"\37\3\37\5\37\u02b9\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u02c2\n \f \16 \u02c5"+
		"\13 \3 \3 \5 \u02c9\n \3!\3!\3!\3!\3!\5!\u02d0\n!\3\"\5\"\u02d3\n\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\5&\u02df\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\59\u030b"+
		"\n9\3:\3:\3:\3\u00d6\3$;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\20\4\2))CC\7\2  OOXX"+
		"\u0081\u0081\u0084\u0084\4\2\16\16\23\24\3\2\17\20\3\2\25\30\3\2\31\34"+
		"\4\2\r\r\35\37\6\2TThhjj}}\4\2BB\u0092\u0092\5\2  OO\u0084\u0084\6\2;"+
		"=oo\u009d\u009d\u009f\u00a0\4\2\17\21mm\4\2\u009c\u009c\u009f\u009f\3"+
		"\2 \u009b\u0360\2x\3\2\2\2\4}\3\2\2\2\6\u0080\3\2\2\2\b\u0082\3\2\2\2"+
		"\n\u00a4\3\2\2\2\f\u00a8\3\2\2\2\16\u00b0\3\2\2\2\20\u00b4\3\2\2\2\22"+
		"\u00b8\3\2\2\2\24\u00ba\3\2\2\2\26\u00bc\3\2\2\2\30\u00be\3\2\2\2\32\u00c7"+
		"\3\2\2\2\34\u00c9\3\2\2\2\36\u00d4\3\2\2\2 \u00e6\3\2\2\2\"\u010e\3\2"+
		"\2\2$\u015c\3\2\2\2&\u01b8\3\2\2\2(\u01e8\3\2\2\2*\u01f2\3\2\2\2,\u01fc"+
		"\3\2\2\2.\u0224\3\2\2\2\60\u0233\3\2\2\2\62\u023d\3\2\2\2\64\u0248\3\2"+
		"\2\2\66\u024a\3\2\2\28\u029f\3\2\2\2:\u02a1\3\2\2\2<\u02b8\3\2\2\2>\u02c8"+
		"\3\2\2\2@\u02cf\3\2\2\2B\u02d2\3\2\2\2D\u02d6\3\2\2\2F\u02d8\3\2\2\2H"+
		"\u02da\3\2\2\2J\u02de\3\2\2\2L\u02e0\3\2\2\2N\u02e2\3\2\2\2P\u02e4\3\2"+
		"\2\2R\u02e6\3\2\2\2T\u02e8\3\2\2\2V\u02ea\3\2\2\2X\u02ec\3\2\2\2Z\u02ee"+
		"\3\2\2\2\\\u02f0\3\2\2\2^\u02f2\3\2\2\2`\u02f4\3\2\2\2b\u02f6\3\2\2\2"+
		"d\u02f8\3\2\2\2f\u02fa\3\2\2\2h\u02fc\3\2\2\2j\u02fe\3\2\2\2l\u0300\3"+
		"\2\2\2n\u0302\3\2\2\2p\u030a\3\2\2\2r\u030c\3\2\2\2tw\5\6\4\2uw\5\4\3"+
		"\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2"+
		"\2{|\7\2\2\3|\3\3\2\2\2}~\7\u00a4\2\2~\177\b\3\1\2\177\5\3\2\2\2\u0080"+
		"\u0081\5\b\5\2\u0081\7\3\2\2\2\u0082\u0083\7\u0087\2\2\u0083\u0088\5\n"+
		"\6\2\u0084\u0085\7\f\2\2\u0085\u0087\5\n\6\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7R\2\2\u008c\u008d\7\6\2\2\u008d"+
		"\u0092\5\f\7\2\u008e\u008f\7\f\2\2\u008f\u0091\5\f\7\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u00a2\7\7\2\2\u0096\u0097\7e"+
		"\2\2\u0097\u0098\7\6\2\2\u0098\u009d\5\16\b\2\u0099\u009a\7\'\2\2\u009a"+
		"\u009c\5\16\b\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\7\7\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7"+
		"\5\22\n\2\u00a7\13\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\5\26\f\2\u00aa"+
		"\u00ab\7\5\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7"+
		"(\2\2\u00ae\u00af\5\24\13\2\u00af\r\3\2\2\2\u00b0\u00b1\5\20\t\2\u00b1"+
		"\u00b2\7\r\2\2\u00b2\u00b3\5\20\t\2\u00b3\17\3\2\2\2\u00b4\u00b5\5\24"+
		"\13\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\5\22\n\2\u00b7\21\3\2\2\2\u00b8"+
		"\u00b9\5\32\16\2\u00b9\23\3\2\2\2\u00ba\u00bb\5\32\16\2\u00bb\25\3\2\2"+
		"\2\u00bc\u00bd\5\32\16\2\u00bd\27\3\2\2\2\u00be\u00bf\5\32\16\2\u00bf"+
		"\31\3\2\2\2\u00c0\u00c8\7\u009c\2\2\u00c1\u00c8\5N(\2\u00c2\u00c8\7\u009f"+
		"\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\7\13\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2"+
		"\2\2\u00c7\u00c3\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00cb\5^\60\2\u00ca\u00cc"+
		"\5\36\20\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2"+
		"\u00cd\u00cf\5 \21\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\5P)\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2"+
		"\2\u00d6\u00d4\3\2\2\2\u00d7\u00e2\3\2\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00da"+
		"\5B\"\2\u00da\u00db\7\13\2\2\u00db\u00e3\3\2\2\2\u00dc\u00dd\7\n\2\2\u00dd"+
		"\u00de\5B\"\2\u00de\u00df\7\f\2\2\u00df\u00e0\5B\"\2\u00e0\u00e1\7\13"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e5\78\2\2\u00e5\u00e7\5P)\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u0109\3\2\2\2\u00e8\u00e9\7x"+
		"\2\2\u00e9\u00eb\7f\2\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00f0\7"+
		"+\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u010a\3\2\2\2\u00f1"+
		"\u00f3\7m\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\7o\2\2\u00f5\u010a\5\"\22\2\u00f6\u00f7\7\u0091\2\2\u00f7"+
		"\u010a\5\"\22\2\u00f8\u00f9\7\63\2\2\u00f9\u00fa\7\n\2\2\u00fa\u00fb\5"+
		"$\23\2\u00fb\u00fc\7\13\2\2\u00fc\u010a\3\2\2\2\u00fd\u0104\7?\2\2\u00fe"+
		"\u0105\5B\"\2\u00ff\u0105\5D#\2\u0100\u0101\7\n\2\2\u0101\u0102\5$\23"+
		"\2\u0102\u0103\7\13\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0104"+
		"\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u010a\3\2\2\2\u0106\u0107\7\64"+
		"\2\2\u0107\u010a\5`\61\2\u0108\u010a\5&\24\2\u0109\u00e8\3\2\2\2\u0109"+
		"\u00f2\3\2\2\2\u0109\u00f6\3\2\2\2\u0109\u00f8\3\2\2\2\u0109\u00fd\3\2"+
		"\2\2\u0109\u0106\3\2\2\2\u0109\u0108\3\2\2\2\u010a!\3\2\2\2\u010b\u010c"+
		"\7r\2\2\u010c\u010d\7\67\2\2\u010d\u010f\t\3\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f#\3\2\2\2\u0110\u0111\b\23\1\2\u0111\u0112\5F$\2\u0112"+
		"\u0113\5$\23\27\u0113\u015d\3\2\2\2\u0114\u015d\5D#\2\u0115\u015d\7\u009e"+
		"\2\2\u0116\u0117\5\30\r\2\u0117\u0118\7\t\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\5X"+
		"-\2\u011c\u011d\7\t\2\2\u011d\u011f\3\2\2\2\u011e\u0119\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u015d\5^\60\2\u0121\u0122\5R"+
		"*\2\u0122\u012f\7\n\2\2\u0123\u0125\7E\2\2\u0124\u0123\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012b\5$\23\2\u0127\u0128\7\f\2\2\u0128"+
		"\u012a\5$\23\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u0130\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0130\7\16\2\2\u012f\u0124\3\2\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\13\2\2\u0132\u015d\3\2\2\2\u0133"+
		"\u0134\7\n\2\2\u0134\u0135\5$\23\2\u0135\u0136\7\13\2\2\u0136\u015d\3"+
		"\2\2\2\u0137\u0138\7\62\2\2\u0138\u0139\7\n\2\2\u0139\u013a\5$\23\2\u013a"+
		"\u013b\7(\2\2\u013b\u013c\5\36\20\2\u013c\u013d\7\13\2\2\u013d\u015d\3"+
		"\2\2\2\u013e\u0140\7m\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\7M\2\2\u0142\u013f\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\n\2\2\u0145\u0146\5\b\5\2\u0146"+
		"\u0147\7\13\2\2\u0147\u015d\3\2\2\2\u0148\u014a\7\61\2\2\u0149\u014b\5"+
		"$\23\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0151\3\2\2\2\u014c"+
		"\u014d\7\u0098\2\2\u014d\u014e\5$\23\2\u014e\u014f\7\u008c\2\2\u014f\u0150"+
		"\5$\23\2\u0150\u0152\3\2\2\2\u0151\u014c\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\7H"+
		"\2\2\u0156\u0158\5$\23\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\7I\2\2\u015a\u015d\3\2\2\2\u015b\u015d\5(\25"+
		"\2\u015c\u0110\3\2\2\2\u015c\u0114\3\2\2\2\u015c\u0115\3\2\2\2\u015c\u011e"+
		"\3\2\2\2\u015c\u0121\3\2\2\2\u015c\u0133\3\2\2\2\u015c\u0137\3\2\2\2\u015c"+
		"\u0142\3\2\2\2\u015c\u0148\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u01b5\3\2"+
		"\2\2\u015e\u015f\f\26\2\2\u015f\u0160\7\22\2\2\u0160\u01b4\5$\23\27\u0161"+
		"\u0162\f\25\2\2\u0162\u0163\t\4\2\2\u0163\u01b4\5$\23\26\u0164\u0165\f"+
		"\24\2\2\u0165\u0166\t\5\2\2\u0166\u01b4\5$\23\25\u0167\u0168\f\23\2\2"+
		"\u0168\u0169\t\6\2\2\u0169\u01b4\5$\23\24\u016a\u016b\f\22\2\2\u016b\u016c"+
		"\t\7\2\2\u016c\u01b4\5$\23\23\u016d\u016e\f\21\2\2\u016e\u016f\t\b\2\2"+
		"\u016f\u01b4\5$\23\22\u0170\u0171\f\17\2\2\u0171\u0172\7\'\2\2\u0172\u01b4"+
		"\5$\23\20\u0173\u0174\f\16\2\2\u0174\u0175\7s\2\2\u0175\u01b4\5$\23\17"+
		"\u0176\u0177\f\7\2\2\u0177\u0179\7c\2\2\u0178\u017a\7m\2\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u01b4\5$\23\b\u017c"+
		"\u017e\f\6\2\2\u017d\u017f\7m\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7.\2\2\u0181\u0182\5$\23\2\u0182"+
		"\u0183\7\'\2\2\u0183\u0184\5$\23\7\u0184\u01b4\3\2\2\2\u0185\u0187\f\20"+
		"\2\2\u0186\u0188\7m\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u019d\7Z\2\2\u018a\u0194\7\n\2\2\u018b\u0195\5\b"+
		"\5\2\u018c\u0191\5$\23\2\u018d\u018e\7\f\2\2\u018e\u0190\5$\23\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u018b\3\2\2\2\u0194"+
		"\u018c\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019e\7\13"+
		"\2\2\u0197\u0198\5\30\r\2\u0198\u0199\7\t\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0197\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\5X"+
		"-\2\u019d\u018a\3\2\2\2\u019d\u019a\3\2\2\2\u019e\u01b4\3\2\2\2\u019f"+
		"\u01a0\f\n\2\2\u01a0\u01a1\7\64\2\2\u01a1\u01b4\5`\61\2\u01a2\u01a4\f"+
		"\t\2\2\u01a3\u01a5\7m\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\t\t\2\2\u01a7\u01aa\5$\23\2\u01a8\u01a9\7J"+
		"\2\2\u01a9\u01ab\5$\23\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01b4\3\2\2\2\u01ac\u01b1\f\b\2\2\u01ad\u01b2\7d\2\2\u01ae\u01b2\7n\2"+
		"\2\u01af\u01b0\7m\2\2\u01b0\u01b2\7o\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u015e\3\2\2\2\u01b3"+
		"\u0161\3\2\2\2\u01b3\u0164\3\2\2\2\u01b3\u0167\3\2\2\2\u01b3\u016a\3\2"+
		"\2\2\u01b3\u016d\3\2\2\2\u01b3\u0170\3\2\2\2\u01b3\u0173\3\2\2\2\u01b3"+
		"\u0176\3\2\2\2\u01b3\u017c\3\2\2\2\u01b3\u0185\3\2\2\2\u01b3\u019f\3\2"+
		"\2\2\u01b3\u01a2\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6%\3\2\2\2\u01b7\u01b5\3\2\2\2"+
		"\u01b8\u01b9\7|\2\2\u01b9\u01c5\5b\62\2\u01ba\u01bb\7\n\2\2\u01bb\u01c0"+
		"\5^\60\2\u01bc\u01bd\7\f\2\2\u01bd\u01bf\5^\60\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7\13\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01ba\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01d9\3\2\2\2\u01c7\u01c8\7r"+
		"\2\2\u01c8\u01d1\t\n\2\2\u01c9\u01ca\7\u0088\2\2\u01ca\u01d2\7o\2\2\u01cb"+
		"\u01cc\7\u0088\2\2\u01cc\u01d2\7?\2\2\u01cd\u01d2\7\60\2\2\u01ce\u01d2"+
		"\7\u0082\2\2\u01cf\u01d0\7l\2\2\u01d0\u01d2\7!\2\2\u01d1\u01c9\3\2\2\2"+
		"\u01d1\u01cb\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d6\3\2\2\2\u01d3\u01d4\7j\2\2\u01d4\u01d6\5P)\2\u01d5"+
		"\u01c7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01e6\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\7m\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e4\7@\2\2\u01e0"+
		"\u01e1\7]\2\2\u01e1\u01e5\7A\2\2\u01e2\u01e3\7]\2\2\u01e3\u01e5\7Y\2\2"+
		"\u01e4\u01e0\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7"+
		"\3\2\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\'\3\2\2\2\u01e8"+
		"\u01e9\7z\2\2\u01e9\u01ee\7\n\2\2\u01ea\u01ef\7X\2\2\u01eb\u01ec\t\13"+
		"\2\2\u01ec\u01ed\7\f\2\2\u01ed\u01ef\5H%\2\u01ee\u01ea\3\2\2\2\u01ee\u01eb"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\13\2\2\u01f1)\3\2\2\2\u01f2"+
		"\u01f5\5^\60\2\u01f3\u01f4\7\64\2\2\u01f4\u01f6\5`\61\2\u01f5\u01f3\3"+
		"\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\t\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9+\3\2\2\2\u01fa\u01fb\78\2\2\u01fb"+
		"\u01fd\5P)\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0222\3\2\2"+
		"\2\u01fe\u01ff\7x\2\2\u01ff\u0202\7f\2\2\u0200\u0202\7\u0091\2\2\u0201"+
		"\u01fe\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\n"+
		"\2\2\u0204\u0209\5*\26\2\u0205\u0206\7\f\2\2\u0206\u0208\5*\26\2\u0207"+
		"\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\13\2\2\u020d"+
		"\u020e\5\"\22\2\u020e\u0223\3\2\2\2\u020f\u0210\7\63\2\2\u0210\u0211\7"+
		"\n\2\2\u0211\u0212\5$\23\2\u0212\u0213\7\13\2\2\u0213\u0223\3\2\2\2\u0214"+
		"\u0215\7Q\2\2\u0215\u0216\7f\2\2\u0216\u0217\7\n\2\2\u0217\u021c\5^\60"+
		"\2\u0218\u0219\7\f\2\2\u0219\u021b\5^\60\2\u021a\u0218\3\2\2\2\u021b\u021e"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021f\u0220\7\13\2\2\u0220\u0221\5&\24\2\u0221\u0223\3"+
		"\2\2\2\u0222\u0201\3\2\2\2\u0222\u020f\3\2\2\2\u0222\u0214\3\2\2\2\u0223"+
		"-\3\2\2\2\u0224\u0226\7\u009a\2\2\u0225\u0227\7{\2\2\u0226\u0225\3\2\2"+
		"\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022d\5\66\34\2\u0229"+
		"\u022a\7\f\2\2\u022a\u022c\5\66\34\2\u022b\u0229\3\2\2\2\u022c\u022f\3"+
		"\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e/\3\2\2\2\u022f\u022d"+
		"\3\2\2\2\u0230\u0231\5\30\r\2\u0231\u0232\7\t\2\2\u0232\u0234\3\2\2\2"+
		"\u0233\u0230\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023b"+
		"\5X-\2\u0236\u0237\7\\\2\2\u0237\u0238\7/\2\2\u0238\u023c\5d\63\2\u0239"+
		"\u023a\7m\2\2\u023a\u023c\7\\\2\2\u023b\u0236\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\61\3\2\2\2\u023d\u0240\5$\23\2\u023e\u023f"+
		"\7\64\2\2\u023f\u0241\5`\61\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2"+
		"\u0241\u0243\3\2\2\2\u0242\u0244\t\2\2\2\u0243\u0242\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\63\3\2\2\2\u0245\u0249\5B\"\2\u0246\u0249\5P)\2\u0247\u0249"+
		"\7\u009f\2\2\u0248\u0245\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2"+
		"\2\u0249\65\3\2\2\2\u024a\u0256\5X-\2\u024b\u024c\7\n\2\2\u024c\u0251"+
		"\5^\60\2\u024d\u024e\7\f\2\2\u024e\u0250\5^\60\2\u024f\u024d\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7\13\2\2\u0255\u0257\3\2\2\2\u0256"+
		"\u024b\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7("+
		"\2\2\u0259\u025a\7\n\2\2\u025a\u025b\5\b\5\2\u025b\u025c\7\13\2\2\u025c"+
		"\67\3\2\2\2\u025d\u025e\5T+\2\u025e\u025f\7\t\2\2\u025f\u0261\3\2\2\2"+
		"\u0260\u025d\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0267"+
		"\5X-\2\u0263\u0265\7(\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0268\5p9\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2"+
		"\2\u0268\u026e\3\2\2\2\u0269\u026a\7\\\2\2\u026a\u026b\7/\2\2\u026b\u026f"+
		"\5d\63\2\u026c\u026d\7m\2\2\u026d\u026f\7\\\2\2\u026e\u0269\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u02a0\3\2\2\2\u0270\u0271\5T"+
		"+\2\u0271\u0272\7\t\2\2\u0272\u0274\3\2\2\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5V,\2\u0276\u027f\7\n\2"+
		"\2\u0277\u027c\5$\23\2\u0278\u0279\7\f\2\2\u0279\u027b\5$\23\2\u027a\u0278"+
		"\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0277\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0286\7\13\2\2\u0282\u0284\7(\2\2\u0283"+
		"\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\5p"+
		"9\2\u0286\u0283\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u02a0\3\2\2\2\u0288"+
		"\u0292\7\n\2\2\u0289\u028e\58\35\2\u028a\u028b\7\f\2\2\u028b\u028d\58"+
		"\35\2\u028c\u028a\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0293\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0293\5:"+
		"\36\2\u0292\u0289\3\2\2\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\7\13\2\2\u0295\u02a0\3\2\2\2\u0296\u0297\7\n\2\2\u0297\u0298\5"+
		"\b\5\2\u0298\u029d\7\13\2\2\u0299\u029b\7(\2\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\5p9\2\u029d\u029a\3\2\2"+
		"\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u0260\3\2\2\2\u029f\u0273"+
		"\3\2\2\2\u029f\u0288\3\2\2\2\u029f\u0296\3\2\2\2\u02a09\3\2\2\2\u02a1"+
		"\u02a8\58\35\2\u02a2\u02a3\5<\37\2\u02a3\u02a4\58\35\2\u02a4\u02a5\5>"+
		" \2\u02a5\u02a7\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9;\3\2\2\2\u02aa\u02a8\3\2\2\2"+
		"\u02ab\u02b9\7\f\2\2\u02ac\u02ae\7k\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02b5\3\2\2\2\u02af\u02b1\7g\2\2\u02b0\u02b2\7u\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b6\3\2\2\2\u02b3\u02b6\7^"+
		"\2\2\u02b4\u02b6\7:\2\2\u02b5\u02af\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\7e"+
		"\2\2\u02b8\u02ab\3\2\2\2\u02b8\u02ad\3\2\2\2\u02b9=\3\2\2\2\u02ba\u02bb"+
		"\7r\2\2\u02bb\u02c9\5$\23\2\u02bc\u02bd\7\u0093\2\2\u02bd\u02be\7\n\2"+
		"\2\u02be\u02c3\5^\60\2\u02bf\u02c0\7\f\2\2\u02c0\u02c2\5^\60\2\u02c1\u02bf"+
		"\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\7\13\2\2\u02c7\u02c9\3"+
		"\2\2\2\u02c8\u02ba\3\2\2\2\u02c8\u02bc\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"?\3\2\2\2\u02ca\u02d0\7\u0090\2\2\u02cb\u02cc\7\u0090\2\2\u02cc\u02d0"+
		"\7$\2\2\u02cd\u02d0\7a\2\2\u02ce\u02d0\7K\2\2\u02cf\u02ca\3\2\2\2\u02cf"+
		"\u02cb\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0A\3\2\2\2"+
		"\u02d1\u02d3\t\5\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\7\u009d\2\2\u02d5C\3\2\2\2\u02d6\u02d7\t\f\2\2\u02d7"+
		"E\3\2\2\2\u02d8\u02d9\t\r\2\2\u02d9G\3\2\2\2\u02da\u02db\7\u009f\2\2\u02db"+
		"I\3\2\2\2\u02dc\u02df\5$\23\2\u02dd\u02df\5\34\17\2\u02de\u02dc\3\2\2"+
		"\2\u02de\u02dd\3\2\2\2\u02dfK\3\2\2\2\u02e0\u02e1\t\16\2\2\u02e1M\3\2"+
		"\2\2\u02e2\u02e3\t\17\2\2\u02e3O\3\2\2\2\u02e4\u02e5\5\32\16\2\u02e5Q"+
		"\3\2\2\2\u02e6\u02e7\5\32\16\2\u02e7S\3\2\2\2\u02e8\u02e9\5\32\16\2\u02e9"+
		"U\3\2\2\2\u02ea\u02eb\5\32\16\2\u02ebW\3\2\2\2\u02ec\u02ed\5\32\16\2\u02ed"+
		"Y\3\2\2\2\u02ee\u02ef\5\32\16\2\u02ef[\3\2\2\2\u02f0\u02f1\5\32\16\2\u02f1"+
		"]\3\2\2\2\u02f2\u02f3\5\32\16\2\u02f3_\3\2\2\2\u02f4\u02f5\5\32\16\2\u02f5"+
		"a\3\2\2\2\u02f6\u02f7\5\32\16\2\u02f7c\3\2\2\2\u02f8\u02f9\5\32\16\2\u02f9"+
		"e\3\2\2\2\u02fa\u02fb\5\32\16\2\u02fbg\3\2\2\2\u02fc\u02fd\5\32\16\2\u02fd"+
		"i\3\2\2\2\u02fe\u02ff\5\32\16\2\u02ffk\3\2\2\2\u0300\u0301\5\32\16\2\u0301"+
		"m\3\2\2\2\u0302\u0303\5\32\16\2\u0303o\3\2\2\2\u0304\u030b\7\u009c\2\2"+
		"\u0305\u030b\7\u009f\2\2\u0306\u0307\7\n\2\2\u0307\u0308\5p9\2\u0308\u0309"+
		"\7\13\2\2\u0309\u030b\3\2\2\2\u030a\u0304\3\2\2\2\u030a\u0305\3\2\2\2"+
		"\u030a\u0306\3\2\2\2\u030bq\3\2\2\2\u030c\u030d\5\32\16\2\u030ds\3\2\2"+
		"\2]vx\u0088\u0092\u009d\u00a2\u00c7\u00cb\u00d0\u00d6\u00e2\u00e6\u00eb"+
		"\u00ef\u00f2\u0104\u0109\u010e\u0119\u011e\u0124\u012b\u012f\u013f\u0142"+
		"\u014a\u0153\u0157\u015c\u0179\u017e\u0187\u0191\u0194\u019a\u019d\u01a4"+
		"\u01aa\u01b1\u01b3\u01b5\u01c0\u01c5\u01d1\u01d5\u01d9\u01dd\u01e4\u01e6"+
		"\u01ee\u01f5\u01f8\u01fc\u0201\u0209\u021c\u0222\u0226\u022d\u0233\u023b"+
		"\u0240\u0243\u0248\u0251\u0256\u0260\u0264\u0267\u026e\u0273\u027c\u027f"+
		"\u0283\u0286\u028e\u0292\u029a\u029d\u029f\u02a8\u02ad\u02b1\u02b5\u02b8"+
		"\u02c3\u02c8\u02cf\u02d2\u02de\u030a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}