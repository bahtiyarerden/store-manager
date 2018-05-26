package tr.edu.ege.store_manager.wrapper.transformation;

public class ResultTransformer {

	private TransformerStrategy strategy;

	public ResultTransformer(TransformerStrategy strategy) {
		this.strategy = strategy;
	}

	public String transform(String result) {
		return this.strategy.transform(result);
	}

}
