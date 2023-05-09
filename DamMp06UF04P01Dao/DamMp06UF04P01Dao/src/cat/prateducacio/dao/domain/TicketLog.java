package cat.prateducacio.dao.domain;

public class TicketLog extends Ticket {

	private String application;

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "TicketLog [application=" + application + ", getId()=" + getId() + ", getTitle()=" + getTitle() + "]";
	}

}
