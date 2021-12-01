package controllers;

public class PageController {
	
	//reference to model 
	models.Lessons model;
	//reference to view
	views.PageView view;
	//controller needs access to both of them 
	
	//constructor 
	public PageController(models.Lessons model, views.PageView view)
	{
		//set inner attributes to reference objects sent in constructor 
		this.model = model;
		this.view = view;
		//need view to display itself 
		view.show();
		
	}
	
	public void updateModel(String contentId)
	{
		//split the name from the number (transformation part) 
		String contentId= "";
		String couresNumber = "";
		
		//pass to model  
		model.setContentId(contentId);
		model.setContentOrder(contentOrder[]);
		
		view.show();
	}
	
	/*
	public String previewChange()
	{
		//to display change in page to user, returns preview of change
		//used a string as an example of functionality, would need to return static file reflecting changes made by user 
		return "change";
	}
	
	public void onRemove(int contentId)
	{
		this.contentId = contentId;
		//removing multimedia content from page
		previewChange();
	}
	
	public void undoRemove(int contentId)
	{
		this.contentId = contentId;
		//undo delete on multimedia content on page
		previewChange();
	}
	
	public void reorderContent(int[] contentOrder)
	{
		//function will rearrange content order based on id numbers stored in array 
		this.contentOrder = contentOrder;
		previewChange();
	}
	
	public int addContent()
	{
		//function to create content and adds to order array 
		return contentId;
	}
	
	public void downloadContent(int contentId)
	{
		//user downloads content off page based on contentId
		this.contentId = contentId;
	}*/
	
	
	
	
}
