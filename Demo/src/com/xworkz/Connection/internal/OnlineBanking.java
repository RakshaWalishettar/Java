package com.xworkz.Connection.internal;

public interface OnlineBanking {
    void transferFunds();
    void checkBalance();
    void downloadStatement();
    default void app() {
        System.out.println("Welcome!");
    }
}
