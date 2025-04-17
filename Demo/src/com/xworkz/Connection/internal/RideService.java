package com.xworkz.Connection.internal;

public interface RideService {
    void bookRide();
    void trackRide();
    void cancelRide();
    default void booking() {
        System.out.println("Welcome!");
    }
}
