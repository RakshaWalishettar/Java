package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.VacuumCleaner;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        VacuumCleaner vc = new VacuumCleaner("Dyson", 'A', 2000);
        System.out.println(vc);
    }
}
