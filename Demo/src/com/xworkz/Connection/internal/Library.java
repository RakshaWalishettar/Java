package com.xworkz.Connection.internal;

public interface Library {
    void borrowBook();
    void returnBook();
    void searchCatalog();
    default void greatScilence() {
        System.out.println("Welcome, how  can i help.");
    }
}
