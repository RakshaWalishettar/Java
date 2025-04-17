package com.xworkz.Connection.internal;

public interface PaymentGateway {
    void authenticate();
    void pay();
    void logout();
    default void transaction() {
        System.out.println("Welcome!");
    }
}
