package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.InkjetPrinter;
import com.xworkz.Connection.internal.Printer;

public class InkjetPrinterRunner {
    public static void main(String[] args) {
        Printer p = new InkjetPrinter();
        p.print();
        p.scan();
        p.cancel();
    }
}
