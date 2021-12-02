package controllers;

import java.util.ArrayList;

import models.Section;

public class PageController {

	models.Page model;

	public PageController(models.Page model) {
		this.model = model;
	}

	private ArrayList<Section> sections;

	public void updateModel(ArrayList<Section> sections) {
		model.setSections(sections);
		// Call Notify to notify all subscribed views that the model has changed
		model.Notify();
	}

	public ArrayList<Section> reorderSections(int[] order) {
		// Take in a new ordering for existing sections
		// and apply it to the sections ArrayList
		return this.sections;
	}

	public void addSection(Section section) {
		model.getSections().add(section);
	}

	public models.Page downloadContent() {
		// Implement functionality to download page content
		return this.model;
	}
}