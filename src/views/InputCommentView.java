package views;

public class InputCommentView extends Observer {

	private models.Comment commentModel;

	public InputCommentView(models.Comment commentModel) {
		this.commentModel = commentModel;
		this.setModel(commentModel);
	}

	public void setModel(models.Comment commentModel) {
		if (this.commentModel != null) {
			this.commentModel.detach(this);
		}
		this.commentModel = commentModel;
		this.commentModel.attach(this);
	}

	public models.Comment getModel() {
		return this.commentModel;
	}

	@Override
	public void update() {
		// Refresh the page and update the HTML
	}
}