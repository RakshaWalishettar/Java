package com.xworkz.Connection.internal;

public interface TaxiService {
    void bookRide();
    void startTrip();
    void endTrip();
    default void booking() {
        System.out.println("Welcome!");
    }
}
