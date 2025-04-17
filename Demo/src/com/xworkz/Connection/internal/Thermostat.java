package com.xworkz.Connection.internal;

public interface Thermostat {
    void increaseTemperature();
    void decreaseTemperature();
    void displayTemperature();
    default void bottle() {
        System.out.println("Welcome!");
    }
}
