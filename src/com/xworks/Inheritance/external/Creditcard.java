package com.xworks.Inheritance.external;

public class Creditcard extends Payment {
    {
        super.processPayment();
        System.out.println("Processing credit card payment...");
    }

    {
        super.refundPayment();
        System.out.println("Refunding credit card payment...");
    }

    {
        super.validatePayment();
        System.out.println("Validating credit card details...");
    }

    {
        super.confirmPayment();
        System.out.println("Confirming credit card transaction...");
    }

    {
        super.cancelPayment();
        System.out.println("Canceling credit card transaction...");
    }
}
