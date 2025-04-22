package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Comparator;

public class ComparatorUser {
    private Comparator comparator;
    public ComparatorUser(Comparator comparator) {
        this.comparator = comparator;
        System.out.println("ComparatorUser initialized");
    }
    public void execute() {
        System.out.println("Comparing values...");
        if (this.comparator != null) {
            this.comparator.compare();
        } else {
            System.out.println("no comparing");
        }
    }
}
