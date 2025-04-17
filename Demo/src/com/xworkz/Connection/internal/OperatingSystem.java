package com.xworkz.Connection.internal;

public interface OperatingSystem {
    void boot();
    void runProcess();
    void shutdown();
    default void subject() {
        System.out.println("Welcome!");
    }
}
