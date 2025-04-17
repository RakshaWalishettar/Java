package com.xworkz.Connection.internal;

public interface SmartDevice {
    void turnOn();
    void adjustSetting();
    void turnOff();
    default void switchButton() {
        System.out.println("Welcome!");
    }
}
