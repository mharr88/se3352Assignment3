package controllers;

public class SectionContoller extends PageController {

	private String newName;
	
	public String renameSection(String newName)
	{
		this.setNewName(newName);
		return newName;
	}

	public void redirectUser(String pageName)
	{
		//function to redirect user to another page 
	}
	
	private String getNewName() {
		return newName;
	}

	private void setNewName(String newName) {
		this.newName = newName;
	}
}
