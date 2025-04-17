package com.xworkz.Connection.internal;

public interface Tool {
    void pickUp();
    void use();
    void putDown();
    default void sharp() {
        System.out.println("Welcome!");
    }
}
