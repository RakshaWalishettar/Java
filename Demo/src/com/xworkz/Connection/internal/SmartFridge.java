package com.xworkz.Connection.internal;

public interface SmartFridge {
    void checkInventory();
    void coolItems();
    void notifyExpiry();
    default void sendMessage() {
        System.out.println("Welcome!");
    }
}
