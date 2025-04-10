package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.ConventionCenter;

public class ConventionCenterRunner {
    public static void main(String[] args) {
        ConventionCenter cc = new ConventionCenter("ExpoCenter", 'E', 2000);
        System.out.println(cc);

        int code = cc.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cc));
    }
}
