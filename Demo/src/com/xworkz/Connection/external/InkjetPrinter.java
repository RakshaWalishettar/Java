package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Printer;

public class InkjetPrinter implements Printer {
    public void print() {
        System.out.println("Inkjet printer is printing...");
    }
    public void scan() {
        System.out.println("Inkjet printer is scanning...");
    }
    public void cancel() {
        System.out.println("Print job cancelled.");
    }
}
