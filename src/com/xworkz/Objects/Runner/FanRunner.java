package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan f = new Fan("Usha", 5, true);
        System.out.println(f);

        int code = f.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(f));
    }
}
