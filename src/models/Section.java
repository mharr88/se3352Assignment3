package models;

public class Section extends Subject {
	public Section(String content) {
		super();
		this.content = content;
	}

	private String content;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
