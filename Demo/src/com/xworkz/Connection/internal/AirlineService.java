package com.xworkz.Connection.internal;

public interface AirlineService {
    void bookTicket();
    void checkIn();
    void boardFlight();
    default void flightlanding() {
        System.out.println("Welcome, how  can i help.");
    }
}
