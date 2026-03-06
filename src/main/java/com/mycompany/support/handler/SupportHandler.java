package com.mycompany.support.handler;

import com.mycompany.support.model.Request;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void handleNext(Request request) {
        if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public abstract void handleRequest(Request request);
}
