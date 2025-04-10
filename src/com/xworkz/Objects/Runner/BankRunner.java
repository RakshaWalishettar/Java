package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank("SafeBank", 'B', 2000);
        System.out.println(bank);

        int code = bank.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bank));
    }
}
