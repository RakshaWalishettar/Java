package com.xworkz.Connection.internal;

public interface RemoteControl {
    void turnOn();
    void changeChannel();
    void turnOff();
    default void buttons() {
        System.out.println("Welcome!");
    }
}
