package tr.edu.ege.store_manager.execution;

public class QueryExecutor {
	private ExecutionStrategy strategy;

	public QueryExecutor(ExecutionStrategy strategy) {
		this.strategy = strategy;
	}

	public String execute(String query) {
		return this.strategy.execute(query);
	}
}
