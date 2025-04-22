package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Payment;

public class PaymentService {
    private Payment payment;
    public PaymentService(Payment payment) {
        this.payment = payment;
        System.out.println("PaymentService initialized");
    }
    public void execute() {
        System.out.println("Executing payment...");
        if(this.payment!=null){
            payment.process();
        }

    }
}
