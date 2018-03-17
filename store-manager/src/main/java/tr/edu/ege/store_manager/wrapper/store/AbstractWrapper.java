package tr.edu.ege.store_manager.wrapper.store;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.execution.QueryExecutor;
import tr.edu.ege.store_manager.wrapper.transformation.QueryTransformer;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;

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
