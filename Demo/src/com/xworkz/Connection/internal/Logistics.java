package com.xworkz.Connection.internal;

public interface Logistics {
    void dispatch();
    void track();
    void deliver();
    default void Package() {
        System.out.println("Welcome!");
    }
}
