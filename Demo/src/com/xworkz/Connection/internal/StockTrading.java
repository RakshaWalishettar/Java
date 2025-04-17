package com.xworkz.Connection.internal;

public interface StockTrading {
    void buyStock();
    void sellStock();
    void viewPortfolio();
    default void profit() {
        System.out.println("Welcome!");
    }
}
