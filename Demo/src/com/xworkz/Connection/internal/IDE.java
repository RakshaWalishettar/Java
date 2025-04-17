package com.xworkz.Connection.internal;

public interface IDE {
    void writeCode();
    void debug();
    void buildProject();
    default void software() {
        System.out.println("Welcome!");
    }
}
