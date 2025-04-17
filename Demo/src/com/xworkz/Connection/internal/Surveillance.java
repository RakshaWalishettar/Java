package com.xworkz.Connection.internal;

public interface Surveillance {
    void startRecording();
    void detectMotion();
    void stopRecording();
    default void greetUser() {
        System.out.println("Welcome, User.");
    }
}
