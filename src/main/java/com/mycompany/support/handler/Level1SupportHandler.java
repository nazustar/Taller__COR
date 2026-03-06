package com.mycompany.support.handler;

//Import from other packages.
import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

//Extend the abstract class called Support Handler.
public class Level1SupportHandler extends SupportHandler {
    //Here we override the abstract methods from the support handler.
    @Override
    public void handleRequest (Request request){
        //Here evaluates if the priority is basic, if it isn't the program send the request to the next handler.
        if (request.getPriority()== Priority.BASIC) {
            System.out.println("Support handler #1: Basic request.");
        } else {
        handleNext(request);
        }
    }
}
