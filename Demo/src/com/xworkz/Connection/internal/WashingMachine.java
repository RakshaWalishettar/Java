package com.xworkz.Connection.internal;

public interface WashingMachine {
    void startWash();
    void rinse();
    void spin();
    default void user() {
        System.out.println("Welcome!");
    }
}
