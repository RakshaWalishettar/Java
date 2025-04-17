package com.xworkz.Connection.internal;

public interface Warehouse {
    void storeItem();
    void retrieveItem();
    void checkInventory();
    default void item() {
        System.out.println("Welcome, how  can i help.");
    }
}
