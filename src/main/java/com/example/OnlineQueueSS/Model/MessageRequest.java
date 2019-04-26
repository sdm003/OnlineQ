package com.example.OnlineQueueSS.Model;

public class MessageRequest {
    private String name;

    public MessageRequest(String name) {
        this.name = name;
    }

    public MessageRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
