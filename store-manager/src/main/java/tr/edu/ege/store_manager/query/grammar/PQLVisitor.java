package tr.edu.ege.store_manager.query.grammar;

// Generated from PQL.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PQLParser#subjoin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjoin_stmt(@NotNull PQLParser.Subjoin_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull PQLParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#subquery_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_stmt(@NotNull PQLParser.Subquery_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull PQLParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(@NotNull PQLParser.Join_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(@NotNull PQLParser.Indexed_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(@NotNull PQLParser.Literal_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(@NotNull PQLParser.Transaction_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(@NotNull PQLParser.Column_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(@NotNull PQLParser.Sql_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(@NotNull PQLParser.New_table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull PQLParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(@NotNull PQLParser.Error_messageContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull PQLParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(@NotNull PQLParser.Join_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(@NotNull PQLParser.Schema_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(@NotNull PQLParser.Collation_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_function_name(@NotNull PQLParser.Table_function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull PQLParser.Column_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull PQLParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(@NotNull PQLParser.Table_or_index_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(@NotNull PQLParser.Module_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(@NotNull PQLParser.Table_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(@NotNull PQLParser.Module_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_pointer(@NotNull PQLParser.Join_pointerContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(@NotNull PQLParser.Signed_numberContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(@NotNull PQLParser.Ordering_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(@NotNull PQLParser.Table_or_subqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(@NotNull PQLParser.ErrorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(@NotNull PQLParser.Savepoint_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(@NotNull PQLParser.Conflict_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(@NotNull PQLParser.Compound_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(@NotNull PQLParser.Trigger_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(@NotNull PQLParser.Foreign_key_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull PQLParser.Any_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(@NotNull PQLParser.Common_table_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(@NotNull PQLParser.AliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull PQLParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#sub_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_query(@NotNull PQLParser.Sub_queryContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull PQLParser.Index_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(@NotNull PQLParser.View_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull PQLParser.With_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(@NotNull PQLParser.Qualified_table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull PQLParser.Database_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(@NotNull PQLParser.Column_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull PQLParser.Column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull PQLParser.Result_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull PQLParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull PQLParser.Table_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(@NotNull PQLParser.Pragma_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(@NotNull PQLParser.Foreign_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull PQLParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(@NotNull PQLParser.Join_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(@NotNull PQLParser.Raise_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull PQLParser.Select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#join_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_variable(@NotNull PQLParser.Join_variableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(@NotNull PQLParser.Pragma_valueContext ctx);
}