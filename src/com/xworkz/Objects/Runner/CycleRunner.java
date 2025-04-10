package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cycle;

public class CycleRunner {
    public static void main(String[] args) {
        Cycle cycle = new Cycle("Hero", 'M', 18);
        System.out.println(cycle);

        int code = cycle.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cycle));
    }
}
