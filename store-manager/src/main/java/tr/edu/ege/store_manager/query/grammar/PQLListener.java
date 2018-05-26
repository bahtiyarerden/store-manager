package tr.edu.ege.store_manager.query.grammar;

// Generated from PQL.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PQLParser}.
 */
public interface PQLListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link PQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull PQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull PQLParser.Type_nameContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull PQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull PQLParser.Join_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull PQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull PQLParser.Indexed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull PQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull PQLParser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull PQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull PQLParser.Transaction_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull PQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull PQLParser.Column_defContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull PQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull PQLParser.New_table_nameContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull PQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull PQLParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull PQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull PQLParser.Join_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull PQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull PQLParser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull PQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull PQLParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_function_name(@NotNull PQLParser.Table_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_function_name(@NotNull PQLParser.Table_function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull PQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull PQLParser.Column_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull PQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull PQLParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull PQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull PQLParser.Table_or_index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull PQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull PQLParser.Module_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull PQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull PQLParser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull PQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull PQLParser.Module_argumentContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull PQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull PQLParser.Signed_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull PQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull PQLParser.Ordering_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull PQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull PQLParser.Table_or_subqueryContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull PQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull PQLParser.Savepoint_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull PQLParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull PQLParser.Conflict_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull PQLParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull PQLParser.Compound_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull PQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull PQLParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull PQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull PQLParser.Foreign_key_clauseContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull PQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull PQLParser.Common_table_expressionContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PQLParser.ExprContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull PQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull PQLParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull PQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull PQLParser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull PQLParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull PQLParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull PQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull PQLParser.Qualified_table_nameContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull PQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull PQLParser.Column_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull PQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull PQLParser.Column_nameContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull PQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull PQLParser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull PQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull PQLParser.Pragma_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull PQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull PQLParser.Foreign_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull PQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull PQLParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull PQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull PQLParser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PQLParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull PQLParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull PQLParser.Raise_functionContext ctx);

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
	 * Enter a parse tree produced by {@link PQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull PQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull PQLParser.Pragma_valueContext ctx);
}