package models;

import java.util.ArrayList;

public class Page extends Subject {
	public Page(ArrayList<Section> sections) {
		super();
		this.sections = sections;
	}

	private ArrayList<Section> sections;

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}
}
