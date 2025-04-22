package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.PaymentService;
import com.xworkz.Implement.internal.CreditCardPayment;
import com.xworkz.Implement.internal.Payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        PaymentService service = new PaymentService(payment);
        service.execute();
        payment.process();
    }
}
