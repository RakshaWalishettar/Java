package com.xworkz.Connection.internal;

public interface TrafficSignal {
    void showRed();
    void showYellow();
    void showGreen();
    default void rUles() {
        System.out.println("Welcome, how  can i help.");
    }
}
