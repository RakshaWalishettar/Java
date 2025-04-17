package com.xworkz.Connection.internal;

public interface ATM {
    void insertCard();
    void withdrawCash();
    void ejectCard();
    default void greetUser() {
        System.out.println("Welcome!");
    }
}
