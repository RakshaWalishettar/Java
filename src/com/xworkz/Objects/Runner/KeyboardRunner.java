package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard k = new Keyboard("QWERTY", 'M', 104);
        System.out.println(k);

        int code = k.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(k));
    }
}
