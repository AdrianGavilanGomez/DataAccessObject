package cat.prateducacio.dao.app;

import java.sql.SQLException;
import java.util.List;

import cat.prateducacio.dao.domain.TicketLog;
import cat.prateducacio.dao.domain.TicketUser;
import cat.prateducacio.dao.service.TicketLogService;
import cat.prateducacio.dao.service.TicketUserService;

public class Main {

	public static void main(String[] args) throws SQLException {

		//testTicketUser();
		//testTicketLog();

	}
	
	private static void testTicketUser() throws SQLException
	{
		TicketUserService s = new TicketUserService();
		TicketUser t = new TicketUser();
//		t.setMail("pedro@gmail.com");
//		t.setTitle("No puede iniciar sesión en su cuenta");
//		
//
//		s.insert(t);
//		
//		t.setId(1);
//		t.setMail("pedrito@gmail.com");
//		t.setTitle("No puede cambiar la password");
//		s.update(t);
//		
//		s.delete(1);

		t = s.getOne(1);
		if (t != null) {
			System.out.println(t.toString());
		}

		System.out.println("----ALL");
		List<TicketUser> l = s.getAll();
		if (l != null && !l.isEmpty()) {
			for (TicketUser ticket : l) {
				System.out.println(ticket.toString());

			}
		}
	}

	private static void testTicketLog() throws SQLException
	{
		TicketLogService s = new TicketLogService();
		TicketLog t = new TicketLog();
//		t.setApplication("Google Chrome");
//		t.setTitle("No se ejecutan los popup");
//		
//
//		s.insert(t);
//		
//		t.setId(2);
//		t.setApplication("Mozilla Firefox");
//		t.setTitle("No se actualiza el navegador");
//		s.update(t);
//		
//		s.delete(2);

		t = s.getOne(2);
		if (t != null) {
			System.out.println(t.toString());
		}

		System.out.println("----ALL");
		List<TicketLog> l = s.getAll();
		if (l != null && !l.isEmpty()) {
			for (TicketLog ticket : l) {
				System.out.println(ticket.toString());

			}
		}
	}
}
