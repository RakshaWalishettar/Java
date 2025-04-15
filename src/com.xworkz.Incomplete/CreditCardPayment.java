package com.xworkz.Incomplete;

public class CreditCardPayment extends Transaction {

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
