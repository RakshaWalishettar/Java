package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer p = new Printer("HP123", 'L', 25);
        System.out.println(p);

        int code = p.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(p));
    }
}
