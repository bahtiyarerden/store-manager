package tr.edu.ege.store_manager.wrapper.transformation;

public class QueryTransformer {

	private TransformerStrategy strategy;

	public QueryTransformer(TransformerStrategy strategy) {
		this.strategy = strategy;
	}

	public String transform(String result) {
		return this.strategy.transform(result);
	}

}
