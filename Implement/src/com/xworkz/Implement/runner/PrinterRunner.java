package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.PrintService;
import com.xworkz.Implement.internal.Printer;
import com.xworkz.Implement.internal.ReportPrinter;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new ReportPrinter();
        PrintService service = new PrintService(printer);
        service.execute();
    }
}
