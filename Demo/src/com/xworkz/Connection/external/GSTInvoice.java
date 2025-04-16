package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.InvoiceSystem;

public class GSTInvoice implements InvoiceSystem {
    public void generateInvoice() {
        System.out.println("GST Invoice generated.");
    }

    public void sendInvoice() {
        System.out.println("Invoice sent to client.");
    }

    public void printInvoice() {
        System.out.println("Invoice printed.");
    }
}
