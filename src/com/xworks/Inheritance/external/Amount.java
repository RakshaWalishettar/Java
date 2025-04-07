package com.xworks.Inheritance.external;

public class Amount extends Payment{
    public void cash() {
        System.out.println("Amount can be in cash");
    }
    public void withdraw(Payment payment){
        payment.confirmPayment();
        payment.processPayment();
        payment.validatePayment();
        payment.refundPayment();
        payment.cancelPayment();

        if(payment instanceof Amount){
            Amount amount=(Amount) payment;
            System.out.println("the instance of the amount is paymnet");
            amount.cash();
        }
    }
}
