package controllers;

public class SectionController {

	models.Section model;

	public SectionController(models.Section model) {
		this.model = model;
	}

	public void updateModel(String content, String title) {
		this.model.setContent(content);
		this.model.setTitle(title);
		// Call Notify to notify all subscribed views that the model has changed
		this.model.Notify();
	}
}