package models;

import java.util.Date;

public class Ticket extends Subject {
	public Ticket(int priority, String value, Date lastUpdated) {
		super();
		this.priority = priority;
		this.value = value;
		this.lastUpdated = lastUpdated;
	}

	private int priority;
	private String value;
	private Date lastUpdated;

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
