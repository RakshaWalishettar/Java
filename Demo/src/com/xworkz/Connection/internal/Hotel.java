package com.xworkz.Connection.internal;

public interface Hotel {
    void checkIn();
    void roomService();
    void checkOut();
    default void stay() {
        System.out.println("Welcome!");
    }
}
