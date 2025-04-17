package com.xworkz.Connection.internal;

public interface Camera {
    void capturePhoto();
    void recordVideo();
    void switchMode();
    default void reel() {
        System.out.println("Welcome, how  can i help.");
    }
}
