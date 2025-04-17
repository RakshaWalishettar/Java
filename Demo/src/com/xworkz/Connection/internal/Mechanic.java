package com.xworkz.Connection.internal;

public interface Mechanic {
    void inspect();
    void repair();
    void testDrive();
    default void greetUser() {
        System.out.println("Welcome!");
    }
}
