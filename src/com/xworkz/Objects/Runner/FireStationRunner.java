package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.FireStation;

public class FireStationRunner {
    public static void main(String[] args) {
        FireStation fs = new FireStation("Downtown", 'A', 5);
        System.out.println(fs);

        int code = fs.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(fs));
    }
}
