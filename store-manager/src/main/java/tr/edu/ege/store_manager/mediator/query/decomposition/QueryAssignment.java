package tr.edu.ege.store_manager.mediator.query.decomposition;

import java.util.List;

public class QueryAssignment {
	private List<String> resultColumns;
	private String query;
	private String connection;
	private String queryAlias;

	public QueryAssignment() {
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public List<String> getResultColumns() {
		return resultColumns;
	}

	public void setResultColumns(List<String> resultColumns) {
		this.resultColumns = resultColumns;
	}

	public String getQueryAlias() {
		return queryAlias;
	}

	public void setQueryAlias(String queryAlias) {
		this.queryAlias = queryAlias;
	}

	@Override
	public String toString() {
		return "QueryAssignment [resultColumns=" + resultColumns + ", query=" + query + ", connection=" + connection
				+ ", queryAlias=" + queryAlias + "]";
	}
	
	

}
