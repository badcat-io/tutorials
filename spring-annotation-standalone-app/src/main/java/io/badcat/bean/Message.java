package io.badcat.bean;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message = "Hello there!";

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}