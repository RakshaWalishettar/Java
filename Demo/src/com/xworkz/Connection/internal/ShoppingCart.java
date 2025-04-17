package com.xworkz.Connection.internal;

public interface ShoppingCart {
    void addItem();
    void removeItem();
    void checkout();
    default void shopping() {
        System.out.println("Welcome!");
    }
}
