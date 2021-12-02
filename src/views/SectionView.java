package views;

public class SectionView extends Observer {

	private models.Section sectionModel;

	public SectionView(models.Section sectionModel) {
		this.sectionModel = sectionModel;
		this.setModel(sectionModel);
	}

	public void setModel(models.Section sectionModel) {
		if (this.sectionModel != null) {
			this.sectionModel.detach(this);
		}
		this.sectionModel = sectionModel;
		this.sectionModel.attach(this);
	}

	public models.Section getModel() {
		return this.sectionModel;
	}

	@Override
	public void update() {
		// Refresh the page and update the HTML
	}
}