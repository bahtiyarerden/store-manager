package tr.edu.ege.store_manager.wrapper.store.keyvalue;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.execution.keyvalue.RedisExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;
import tr.edu.ege.store_manager.wrapper.transformation.keyvalue.RedisTransformationStrategy;

public class RedisWrapper extends AbstractWrapper {

	public RedisWrapper() {
		this(new RedisExecutionStrategy(), new RedisTransformationStrategy());
	}

	private RedisWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
