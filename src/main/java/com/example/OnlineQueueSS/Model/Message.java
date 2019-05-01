package com.example.OnlineQueueSS.Model;

public enum  Message {

    OK("Вы успешно зарегистрированы"),
    ERROR("Такой логин уже существует");

    private String massege;

    Message(String massege) {
        this.massege = massege;
    }

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }
}
