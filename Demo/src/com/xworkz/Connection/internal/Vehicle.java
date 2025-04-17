package com.xworkz.Connection.internal;

public interface Vehicle {
    void startEngine();
    void stopEngine();
    void accelerate();
    default void greetrider() {
        System.out.println("Welcome, rider. Ready to start.");
    }
}
