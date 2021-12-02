package controllers;

import java.util.Date;

public class TicketController {
	models.Ticket model;

	public TicketController(models.Ticket model) {
		this.model = model;
	}

	public void updateModel(int priority, String value, Date lastUpdated) {
		this.model.setPriority(priority);
		this.model.setValue(value);
		this.model.setLastUpdated(lastUpdated);
		// Call Notify to notify all subscribed views that the model has changed
		this.model.Notify();
	}
}