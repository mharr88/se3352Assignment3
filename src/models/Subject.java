package models;

import java.util.ArrayList;

public abstract class Subject {

	ArrayList<views.Observer> observers = new ArrayList();
	
	//method that allows observers to attach themselves/subscribe 
	public void attach(views.Observer o)
	{
		this.observers.add(o);
	}
	public void detach(views.Observer o)
	{
		this.observers.remove(o);
	}
	public void Notify()
	{
		for (views.Observer o : observers)
		{
			//needs to be accessible to any class that is an observer 
			o.update();
		}
	}
}
