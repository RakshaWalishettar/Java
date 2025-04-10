package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple t = new Temple("SunTemple", 'S', 700);
        System.out.println(t);

        int code = t.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(t));
    }
}
