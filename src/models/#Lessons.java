package models;

public class Lessons {
	private int contentId;
	//10 is arbitrary size because we dont have the functionality in to provide a definite size 
	private int contentOrder[] = new int[10];
	
	
	private int getContentId() {
		return contentId;
	}
	private void setContentId(int contentId) {
		this.contentId = contentId;
	}
	private int[] getContentOrder() {
		return contentOrder;
	}
	private void setContentOrder(int contentOrder[]) {
		this.contentOrder = contentOrder;
	} 

}
