package com.xworkz.Connection.internal;

public interface CleaningService {
    void sweep();
    void mop();
    void dust();
    default void paid() {
        System.out.println("Welcome!");
    }
}
