package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.PaymentGateway;

public class Paypal implements PaymentGateway {
    public void authenticate() {
        System.out.println("User authenticated.");
    }
    public void pay() {
        System.out.println("Payment processed via PayPal.");
    }
    public void logout() {
        System.out.println("User logged out from PayPal.");
    }



}
