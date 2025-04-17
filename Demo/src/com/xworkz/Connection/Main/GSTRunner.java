package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.GSTInvoice;
import com.xworkz.Connection.internal.InvoiceSystem;

public class GSTRunner {
    public static void main(String[] args) {
        InvoiceSystem invoice = new GSTInvoice();
        invoice.generateInvoice();
        invoice.sendInvoice();
        invoice.printInvoice();
        invoice.user();
    }
}
