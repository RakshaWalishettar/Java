package com.xworkz.Connection.internal;

public interface RideSharing {
    void bookRide();
    void startRide();
    void endRide();
    default void online() {
        System.out.println("Welcome!");
    }
}
