package tr.edu.ege.store_manager.wrapper.store.document;

import tr.edu.ege.store_manager.wrapper.execution.document.MongoDBExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.transformation.document.MongoDBTransformerStrategy;

public class MongoDBWrapper extends AbstractWrapper {
	public MongoDBWrapper() {
		this(new MongoDBExecutionStrategy(), new MongoDBTransformerStrategy());
	}

	private MongoDBWrapper(MongoDBExecutionStrategy eStrategy, MongoDBTransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
