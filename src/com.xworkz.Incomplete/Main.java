package com.xworkz.Incomplete;

public class Main {
    public static void main(String[] args) {
        Paypal paypal = new Paypal();
        paypal.connect();


        CreditCardPayment cardPayment = new CreditCardPayment();
        cardPayment.processPayment();


        OnlineInvoice invoice = new OnlineInvoice();
        invoice.generateInvoice();
        invoice.sendEmail();


        RegularCustomer customer = new RegularCustomer("Alice", "alice@example.com", "1234567890");
        customer.displayCustomer();


        OnlineOrder order = new OnlineOrder(101, "Laptop", 1, 999.99);
        order.showOrder();
    }
}
