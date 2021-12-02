package views;

public class PreviewChangeView extends Observer {

	private models.Page pageModel;

	public PreviewChangeView(models.Page pageModel) {
		this.pageModel = pageModel;
		this.setModel(pageModel);
	}

	public void setModel(models.Page pageModel) {
		if (this.pageModel != null) {
			this.pageModel.detach(this);
		}
		this.pageModel = pageModel;
		this.pageModel.attach(this);
	}

	public models.Page getModel() {
		return this.pageModel;
	}

	@Override
	public void update() {
		// Refresh the page and update the HTML
	}
}