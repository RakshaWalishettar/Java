package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Paypal;
import com.xworkz.Connection.internal.PaymentGateway;

public class PaypalRunner {
    public static void main(String[] args) {
        PaymentGateway pg = new Paypal();
        pg.authenticate();
        pg.pay();
        pg.logout();
    }
}
