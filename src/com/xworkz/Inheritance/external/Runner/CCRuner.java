package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Amount;
import com.xworks.Inheritance.external.Creditcard;
import com.xworks.Inheritance.external.Payment;

public class CCRuner {
public static void main(String [] args){
    Payment payment=new Payment();
    payment.validatePayment();
    payment.refundPayment();
    payment.processPayment();
    payment.confirmPayment();
    payment.cancelPayment();

    System.out.println("==============================");
    Creditcard pay=new Creditcard();
    pay.cancelPayment();
    pay.confirmPayment();
    pay.processPayment();
    pay.validatePayment();
    pay.refundPayment();

    System.out.println("==========================");

    Amount amount=new Amount();
    amount.withdraw(payment);
    amount.withdraw(amount);
}}
