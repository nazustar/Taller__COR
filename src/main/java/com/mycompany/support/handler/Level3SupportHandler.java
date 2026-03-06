package com.mycompany.support.handler;

import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Level3SupportHandler extends SupportHandler {

    @Override
    public void handleRequest (Request request){
        
        if (request.getPriority()== Priority.CRITICAL) {
            System.out.println("Support handler #3: Critical request.");
        } else {
        handleNext(request);
        }

    }
}