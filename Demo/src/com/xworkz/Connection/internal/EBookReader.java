package com.xworkz.Connection.internal;

public interface EBookReader {
    void openBook();
    void nextPage();
    void closeBook();
    default void user() {
        System.out.println("Welcome!");
    }
}
