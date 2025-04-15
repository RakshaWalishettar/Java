package com.xworkz.Incomplete;

public abstract class Invoice {
    public abstract void generateInvoice();

    public void sendEmail() {
        System.out.println("Sending invoice email to customer.");
    }
}
