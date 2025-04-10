package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Museum;

public class MuseumRunner {
    public static void main(String[] args) {
        Museum m = new Museum("Heritage Museum", 'C', 200);
        System.out.println(m);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
