package com.api.acadio.api_v1;

public class TestModel
{
    private String message;
    protected TestModel(){

    }

    TestModel(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}