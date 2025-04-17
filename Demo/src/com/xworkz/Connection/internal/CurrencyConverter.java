package com.xworkz.Connection.internal;

public interface CurrencyConverter {
    void setSourceCurrency();
    void setTargetCurrency();
    void convertAmount();
    default void online() {
        System.out.println("Welcome!");
    }
}
