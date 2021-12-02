package views;

public class FeatureRequestView extends Observer {

	private models.Ticket ticketModel;

	public FeatureRequestView(models.Ticket ticketModel) {
		this.ticketModel = ticketModel;
		this.setModel(ticketModel);
	}

	public void setModel(models.Ticket ticketModel) {
		if (this.ticketModel != null) {
			this.ticketModel.detach(this);
		}
		this.ticketModel = ticketModel;
		this.ticketModel.attach(this);
	}

	public models.Ticket getModel() {
		return this.ticketModel;
	}

	@Override
	public void update() {
		// Refresh the page and update the HTML
	}
}
