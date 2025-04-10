package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.SmartWatch;

public class SmartWatchRunner {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch("Apple", 'A', 18);
        System.out.println(sw);

        int code = sw.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(sw));
    }
}
