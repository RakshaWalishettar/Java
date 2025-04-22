package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Cleaner;

public class CleanService {
    private Cleaner cleaner;

    public CleanService(Cleaner cleaner) {
        this.cleaner = cleaner;
        System.out.println("CleanService initialized");
    }

    public void execute() {
        System.out.println("Executing cleaning...");
        if (this.cleaner != null) {
            this.cleaner.clean();
        } else {
            System.out.println("not clean");
        }
    }
}
