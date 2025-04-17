package com.xworkz.Connection.internal;

public interface WaterHeater {
    void turnOn();
    void heatWater();
    void turnOff();
    default void hot() {
        System.out.println("Welcome!");
    }
}
