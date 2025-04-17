package com.xworkz.Connection.internal;

public interface SmartTV {
    void turnOn();
    void changeChannel();
    void turnOff();
    default void user() {
        System.out.println("Welcome!");
    }
}
