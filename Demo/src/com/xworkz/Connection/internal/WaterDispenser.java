package com.xworkz.Connection.internal;

public interface WaterDispenser {
    void dispenseHotWater();
    void dispenseColdWater();
    void stopDispensing();
    default void greetUser() {
        System.out.println("Welcome!");
    }
}
