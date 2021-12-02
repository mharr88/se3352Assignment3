package controllers;

import java.util.Date;

public class CommentController {

	models.Comment model;

	public CommentController(models.Comment model) {
		this.model = model;
	}

	public models.Comment[] getManyCommentsByIds(int[] ids) {
		// Implement functionality to get many comments by ids to be used by
		// CommentsListView

		// Hardcoded example comment
		return new models.Comment[] { new models.Comment(1, new Date(), "Example") };
	}

	public void updateModel(int id, String value, Date lastChanged) {
		model.setId(id);
		model.setValue(value);
		model.setLastChanged(lastChanged);
		// Call Notify to notify all subscribed views that the model has changed
		model.Notify();
	}

}
