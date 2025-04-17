package com.xworkz.Connection.internal;

public interface PowerTool {
    void turnOn();
    void drill();
    void turnOff();
    default void machine() {
        System.out.println("Welcome, how  can i help.");
    }
}
