package com.xworkz.Connection.internal;

public interface Restaurant {
    void takeOrder();
    void prepareFood();
    void serveFood();
    default void delivery() {
        System.out.println("Welcome!");
    }
}
