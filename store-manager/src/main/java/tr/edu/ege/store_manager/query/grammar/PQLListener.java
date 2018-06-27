// Generated from PQL.g4 by ANTLR 4.3
package tr.edu.ege.store_manager.query.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PQLParser}.
 */
public interface PQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull PQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull PQLParser.Error_messageContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#subjoin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubjoin_stmt(@NotNull PQLParser.Subjoin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#subjoin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubjoin_stmt(@NotNull PQLParser.Subjoin_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull PQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull PQLParser.Database_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#join_pointer}.
	 * @param ctx the parse tree
	 */
	void enterJoin_pointer(@NotNull PQLParser.Join_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#join_pointer}.
	 * @param ctx the parse tree
	 */
	void exitJoin_pointer(@NotNull PQLParser.Join_pointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull PQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull PQLParser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull PQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull PQLParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull PQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull PQLParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#subquery_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_stmt(@NotNull PQLParser.Subquery_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#subquery_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_stmt(@NotNull PQLParser.Subquery_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull PQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull PQLParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull PQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull PQLParser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull PQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull PQLParser.AliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#sub_query_content}.
	 * @param ctx the parse tree
	 */
	void enterSub_query_content(@NotNull PQLParser.Sub_query_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#sub_query_content}.
	 * @param ctx the parse tree
	 */
	void exitSub_query_content(@NotNull PQLParser.Sub_query_contentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull PQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull PQLParser.Sql_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull PQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull PQLParser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#sub_query}.
	 * @param ctx the parse tree
	 */
	void enterSub_query(@NotNull PQLParser.Sub_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#sub_query}.
	 * @param ctx the parse tree
	 */
	void exitSub_query(@NotNull PQLParser.Sub_queryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#join_variable}.
	 * @param ctx the parse tree
	 */
	void enterJoin_variable(@NotNull PQLParser.Join_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#join_variable}.
	 * @param ctx the parse tree
	 */
	void exitJoin_variable(@NotNull PQLParser.Join_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull PQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull PQLParser.KeywordContext ctx);
}