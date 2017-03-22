package tr.edu.ege.store_manager.wrappers;

import tr.edu.ege.store_manager.wrappers.document.MongoDBWrapper;

public class WrapperFactory {

	public static AbstractWrapper create(Wrappers wrapper) {
		AbstractWrapper instance = null;
		if (wrapper.equals(Wrappers.MongoDB)) {
			instance = new MongoDBWrapper();
		}
		return instance;
	}

}
