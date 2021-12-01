package views;

public class PageView {

	private models.Lessons model; 
	private controllers.PageController controller;
	
	//constructor
	public PageView(models.Lessons model, controllers.PageController controller)
	{
		this.setModel(model);	
		this.setController(controller);
		
	}
	
	public void show()
	{
		// display or refresh needs to be implemented 
	}
	
	//calls show everytime an update is made to a page 
	public void update()
	{
		this.show();
	}
	
	private models.Lessons getModel() {
		return model;
	}

	private void setModel(models.Lessons model) {
		this.model = model;
	}

	private controllers.PageController getController() {
		return controller;
	}

	private void setController(controllers.PageController controller) {
		this.controller = controller;
	}
	
}
