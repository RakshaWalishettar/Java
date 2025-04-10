package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Stadium;

public class StadiumRunner {
    public static void main(String[] args) {
        Stadium s = new Stadium("ArenaOne", 'F', 40000);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}
