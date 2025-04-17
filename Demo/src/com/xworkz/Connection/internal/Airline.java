package com.xworkz.Connection.internal;

public interface Airline {
    void bookTicket();
    void fly();
    void land();
    default void cheap() {
        System.out.println("Welcome!");
    }

}
