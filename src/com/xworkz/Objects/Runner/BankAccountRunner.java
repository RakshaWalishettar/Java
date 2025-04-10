package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Ravi", 'S', 50000);
        System.out.println(ba);

        int code = ba.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ba));
    }
}
