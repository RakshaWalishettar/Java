package com.xworkz.Connection.internal;

public interface FoodDelivery {
    void placeOrder();
    void trackOrder();
    void receiveOrder();
    default void deliveryfood() {
        System.out.println("Welcome!");
    }
}
