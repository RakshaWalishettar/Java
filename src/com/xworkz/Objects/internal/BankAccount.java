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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof BankAccount) {
                System.out.println("Object is an instance of BankAccount");
                BankAccount other = (BankAccount) obj;
                if (this.holderName.equals(other.holderName)) {
                    System.out.println("Both BankAccount are the same");
                    return true;
                }
            }
        }
        return false;
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
