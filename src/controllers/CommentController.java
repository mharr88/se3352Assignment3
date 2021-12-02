package controllers;

import java.util.Date;

public class CommentController {

    models.Comment model;

    public CommentController(models.Comment model){
        this.model = model;


    }

    public void updateModel(int id, String value, Date lastChanged){
        model.setId(id);
        model.setValue(value);
        model.setLastChanged(lastChanged);
        model.Notify(); // Call model Notify to notify all subscribed views that the model has changed
    }
    
}
