package com.xworkz.Connection.internal;

public interface Headphones {
    void connectBluetooth();
    void playAudio();
    void disconnect();
    default void greetUser() {
        System.out.println("Welcome! Ready to enjoy your music.");
    }

}
