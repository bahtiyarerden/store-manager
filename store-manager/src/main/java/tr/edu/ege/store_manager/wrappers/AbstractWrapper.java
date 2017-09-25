package tr.edu.ege.store_manager.wrappers;

import tr.edu.ege.store_manager.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.execution.QueryExecutor;
import tr.edu.ege.store_manager.transformation.QueryTransformer;
import tr.edu.ege.store_manager.transformation.TransformerStrategy;

public abstract class AbstractWrapper {
	protected QueryExecutor executor;
	protected QueryTransformer transformer;

	public AbstractWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		executor = new QueryExecutor(eStrategy);
		transformer = new QueryTransformer(tStrategy);
	}

	protected String executeTransform(String query) {
		String result = executor.execute(query);
		String transformedResult = transformer.transform(result);
		return transformedResult;
	}

}
