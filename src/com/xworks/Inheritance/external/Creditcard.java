package com.xworks.Inheritance.external;

public class Creditcard extends Payment {
    public Creditcard(){
        System.out.println("no arg const of CC");
    }@Override
    public void processPayment(){
        System.out.println("Processing credit card payment...");
    }
    @Override
    public void refundPayment(){
        System.out.println("Refunding credit card payment...");
    }
    @Override
    public void validatePayment(){
        System.out.println("Validating credit card details...");
    }
    @Override
    public void confirmPayment(){
        System.out.println("Confirming credit card transaction...");
    }
    @Override
    public void cancelPayment(){
        System.out.println("Canceling credit card transaction...");
    }
}
