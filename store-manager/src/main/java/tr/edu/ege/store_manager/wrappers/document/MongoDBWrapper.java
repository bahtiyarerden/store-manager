package tr.edu.ege.store_manager.wrappers.document;

import tr.edu.ege.store_manager.execution.document.MongoDBExecutionStrategy;
import tr.edu.ege.store_manager.transformation.document.MongoDBTransformerStrategy;
import tr.edu.ege.store_manager.wrappers.AbstractWrapper;

public class MongoDBWrapper extends AbstractWrapper {
	public MongoDBWrapper() {
		this(new MongoDBExecutionStrategy(), new MongoDBTransformerStrategy());
	}

	private MongoDBWrapper(MongoDBExecutionStrategy eStrategy, MongoDBTransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
