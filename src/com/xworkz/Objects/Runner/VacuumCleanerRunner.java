package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.VacuumCleaner;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        VacuumCleaner vc = new VacuumCleaner("Dyson", 'A', 2000);
        System.out.println(vc);

        int code = vc.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(vc));
    }
}
