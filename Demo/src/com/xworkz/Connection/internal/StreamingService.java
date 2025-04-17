package com.xworkz.Connection.internal;

public interface StreamingService {
    void playContent();
    void pauseContent();
    void stopContent();
    default void online() {
        System.out.println("Welcome!");
    }
}
