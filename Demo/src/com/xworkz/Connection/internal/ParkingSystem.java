package com.xworkz.Connection.internal;

public interface ParkingSystem {
    void scanTicket();
    void openGate();
    void closeGate();
    default void vehicals() {
        System.out.println("Welcome!");
    }
}
