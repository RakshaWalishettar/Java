package com.xworkz.Connection.internal;

public interface ConstructionMachine {
    void start();
    void operate();
    void shutdown();
    default void greetOperator() {
        System.out.println("Welcome, operator. Ready to begin construction.");
    }
}
