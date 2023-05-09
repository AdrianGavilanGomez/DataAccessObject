package cat.prateducacio.dao.domain;

public class TicketUser extends Ticket  {
	
	private String mail;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "TicketUser [mail=" + mail + ", getId()=" + getId() + ", getTitle()=" + getTitle() + "]";
	}

	

	
	

}
