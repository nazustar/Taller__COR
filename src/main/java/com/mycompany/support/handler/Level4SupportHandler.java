package com.mycompany.support.handler;

import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Level4SupportHandler extends SupportHandler {

    @Override
    public void handleRequest (Request request){
        
        if (request.getPriority()== Priority.URGENT) {
            System.out.println("Support handler #4: Urgent request.");
        } else {
        handleNext(request);
        }

    }
}