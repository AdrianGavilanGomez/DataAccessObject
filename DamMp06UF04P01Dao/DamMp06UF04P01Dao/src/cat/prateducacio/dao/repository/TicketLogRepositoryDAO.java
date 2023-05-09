package cat.prateducacio.dao.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cat.prateducacio.dao.domain.TicketLog;

public class TicketLogRepositoryDAO extends BaseRepositoryDAO<TicketLog> {

	@Override
	public String getCommandInsert(TicketLog e) {
		StringBuilder sb = new StringBuilder();

		sb.append("INSERT INTO TicketsLogs (title, application) ");
		sb.append(" VALUES (");
		sb.append(" '" + e.getTitle() + "'");
		sb.append(", ");
		sb.append(" '" + e.getApplication() + "'");
		sb.append(");");

		System.out.println(sb.toString());
		return sb.toString();
	}

	@Override
	public String getCommandUpdate(TicketLog e) {
		StringBuilder sb = new StringBuilder();

		sb.append("UPDATE TicketsLogs ");
		sb.append("SET ");
		sb.append("title = '" + e.getTitle() + "'");
		sb.append(", ");
		sb.append("application = '" + e.getApplication() + "'");
		sb.append(" WHERE id=" + e.getId() + ";");

		return sb.toString();
	}

	@Override
	public String getCommandDelete(long id) {
		StringBuilder sb = new StringBuilder();

		sb.append("DELETE FROM TicketsLogs");
		sb.append(" WHERE id=" + id + ";");

		return sb.toString();
	}

	@Override
	public List<TicketLog> getListFromResultSet(ResultSet rs) throws SQLException {
		List<TicketLog> result = new ArrayList<TicketLog>();
		while (rs.next()) {
			TicketLog t = new TicketLog();
			t.setId(rs.getLong(1));
			t.setTitle(rs.getString(2));
			t.setApplication(rs.getString(3));
			result.add(t);

		}
		return result;
	}

	@Override
	public String getCommandGetAll() {
		return "SELECT * from TicketsLogs";
	}

	@Override
	public String getCommandGetOne(long id) {
		return "SELECT * from TicketsLogs WHERE id=" + id;
	}

}
