package com.neshab.FreshMart;

public class ResponseGenerator {

    public String generateResponse(){
        ChatGPTService model = new ChatGPTService();
        return model.generate();
    }
}
