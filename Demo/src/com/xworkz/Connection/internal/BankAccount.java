package com.xworkz.Connection.internal;

public interface BankAccount {
    void deposit();
    void withdraw();
    void checkBalance();
    default void SavingsAccount() {
        System.out.println("Welcome!");
    }
}
