package com.xworkz.Objects.internal;

public class BankAccount {
    private String holderName;
    private char accountType;
    private int balance;

    public BankAccount(String holderName, char accountType, int balance) {
        this.holderName = holderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [holderName=" + holderName + ", accountType=" + accountType + ", balance=" + balance + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 12;
    }
}
