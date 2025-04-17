package com.xworkz.Connection.internal;

public interface Printer {
    void print();
    void scan();
    void cancel();
    default void machine() {
        System.out.println("Welcome!");
    }
}
