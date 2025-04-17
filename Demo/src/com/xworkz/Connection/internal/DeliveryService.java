package com.xworkz.Connection.internal;

public interface DeliveryService {
    void pickUp();
    void track();
    void deliver();
    default void greetCustomer() {
        System.out.println("Welcome to the delivery service!");
    }
}
