package com.xworks.Inheritance.external;

public class Seller extends User{
    public void listProduct() {
        System.out.println("Seller listed a product.");
    }

    public void setPrice() {
        System.out.println("Seller set the price.");
    }

    public void processOrder() {
        System.out.println("Seller processed an order.");
    }

    public void shipOrder() {
        System.out.println("Seller shipped the order.");
    }

    public void receivePayment() {
        System.out.println("Seller received payment.");
    }
}
