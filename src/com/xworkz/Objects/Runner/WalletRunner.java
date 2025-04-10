package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet w = new Wallet("Genuine", 'B', 8);
        System.out.println(w);

        int code = w.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(w));
    }
}
