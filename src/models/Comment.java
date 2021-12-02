package models;

import java.util.Date;

public class Comment extends Subject {
	public Comment(int id, Date lastChanged, String value) {
		super();
		this.id = id;
		this.lastChanged = lastChanged;
		this.value = value;
	}

	private int id;
	private Date lastChanged;
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLastChanged() {
		return lastChanged;
	}

	public void setLastChanged(Date lastChanged) {
		this.lastChanged = lastChanged;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
