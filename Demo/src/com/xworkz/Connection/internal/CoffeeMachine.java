package com.xworkz.Connection.internal;

public interface CoffeeMachine {
    void brewCoffee();
    void addMilk();
    void serve();
    default void drink() {
        System.out.println("Welcome!");
    }
}
