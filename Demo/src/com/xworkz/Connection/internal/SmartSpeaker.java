package com.xworkz.Connection.internal;

public interface SmartSpeaker {
    void playMusic();
    void answerQuestion();
    void controlDevices();
    default void greetUser() {
        System.out.println("Welcome! I am your smart speaker.");
    }
}
