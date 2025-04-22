package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Printer;

public class PrintService {
    private Printer printer;
    public PrintService(Printer printer) {
        this.printer = printer;
        System.out.println("PrintService initialized");
    }
    public void execute() {
        System.out.println("Printing report...");
        if (this.printer != null) {
            this.printer.print();
        } else {
            System.out.println("not printing");
        }
    }
}
