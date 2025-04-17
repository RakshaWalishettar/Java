package com.xworkz.Connection.internal;

public interface Smartphone {
    void makeCall();
    void sendText();
    void useApp();
    default void greetUser() {
        System.out.println("Welcome! I am your smart speaker.");
    }
}
