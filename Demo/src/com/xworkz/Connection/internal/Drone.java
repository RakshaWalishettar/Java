package com.xworkz.Connection.internal;

public interface Drone {
    void takeOff();
    void fly();
    void land();
    default void battery() {
        System.out.println("Welcome, how  can i help.");
    }
}
