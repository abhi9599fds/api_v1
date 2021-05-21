package com.api.acadio.api_v1.users.Dto;

public class MessageDto {
    
    private String message;
    protected MessageDto(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageDto(String message){
        this.setMessage(message);
    }
}
