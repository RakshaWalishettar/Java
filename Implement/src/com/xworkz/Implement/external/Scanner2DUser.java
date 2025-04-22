package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Scanner2D;
import com.xworkz.Implement.internal.Scheduler;

public class Scanner2DUser {
    private Scanner2D scanner;
    public Scanner2DUser(Scanner2D scanner) {
        this.scanner = scanner;
        System.out.println("Scanner2DUser set up");
    }
    public void execute() {
        System.out.println("Initiating barcode scan...");
        if (this.scanner != null) {
            System.out.println("not scanning");
        } else {
            System.out.println("scanning");
        }
    }
}
