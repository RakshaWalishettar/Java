package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.BankAccount;

public class SavingsAccount implements BankAccount {

    public void deposit() {
        System.out.println("Deposited  amount");
    }

    public void withdraw() {
        System.out.println("Withdrew  amount");
    }
    public void checkBalance() {
        System.out.println("Current balance balance");
    }
    @Override
    public void SavingsAccount() {
        System.out.println("Welcome!");
    }
}
