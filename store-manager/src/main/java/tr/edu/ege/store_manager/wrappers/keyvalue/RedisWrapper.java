package tr.edu.ege.store_manager.wrappers.keyvalue;

import tr.edu.ege.store_manager.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.execution.keyvalue.RedisExecutionStrategy;
import tr.edu.ege.store_manager.transformation.TransformerStrategy;
import tr.edu.ege.store_manager.transformation.keyvalue.RedisTransformationStrategy;
import tr.edu.ege.store_manager.wrappers.AbstractWrapper;

public class RedisWrapper extends AbstractWrapper {

	public RedisWrapper() {
		this(new RedisExecutionStrategy(), new RedisTransformationStrategy());
	}

	private RedisWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
