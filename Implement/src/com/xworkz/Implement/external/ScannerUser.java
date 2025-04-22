package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Scanner;

public class ScannerUser {
    private Scanner scanner;
    public ScannerUser(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("ScannerUser activated");
    }
    public void execute() {
        System.out.println("Scanning system...");
        if (this.scanner != null) {
            this.scanner.scan();
        } else {
            System.out.println("not scaned");
        }
    }
}
