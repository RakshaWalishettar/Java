package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror m = new Mirror("Oval", 'W', 60);
        System.out.println(m);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
