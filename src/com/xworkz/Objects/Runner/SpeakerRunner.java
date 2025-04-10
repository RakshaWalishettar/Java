package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker s = new Speaker("JBL", 'H', 90);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}
