package com.xworkz.Connection.internal;

public interface InvoiceSystem {
    void generateInvoice();
    void sendInvoice();
    void printInvoice();
    default void user() {
        System.out.println("Welcome!");
    }
}
