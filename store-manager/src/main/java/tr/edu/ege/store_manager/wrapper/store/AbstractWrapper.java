package tr.edu.ege.store_manager.wrapper.store;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.execution.QueryExecutor;
import tr.edu.ege.store_manager.wrapper.transformation.ResultTransformer;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;

public abstract class AbstractWrapper {
	protected QueryExecutor executor;
	protected ResultTransformer transformer;

	public AbstractWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		executor = new QueryExecutor(eStrategy);
		transformer = new ResultTransformer(tStrategy);
	}

	public String executeTransform(QueryAssignment assignment) {
		String result = executor.execute(assignment.getQuery());
		String transformedResult = transformer.transform(result, assignment.getResultColumns());
		return transformedResult;
	}

}
