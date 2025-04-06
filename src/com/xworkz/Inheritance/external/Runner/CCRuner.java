package com.xworkz.Inheritance.external.Runner;

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
    Payment pay=new Creditcard();
    pay.cancelPayment();
    pay.confirmPayment();
    pay.processPayment();
    pay.validatePayment();
    pay.refundPayment();
}}
