package views;

public class CommentsListView extends Observer {

	private models.Comment[] comments;

	public CommentsListView(models.Comment[] comments) {
		this.comments = comments;
		this.setModel(comments);
	}

	public void setModel(models.Comment[] comments) {
		if (this.comments != null) {
			for (models.Comment comment : this.comments) {
				comment.detach(this);
			}
		}
		this.comments = comments;
		for (models.Comment comment : this.comments) {
			comment.attach(this);
		}
	}

	public models.Comment[] getModel() {
		return this.comments;
	}

	@Override
	public void update() {
		// Refresh the page and update the HTML
	}
}