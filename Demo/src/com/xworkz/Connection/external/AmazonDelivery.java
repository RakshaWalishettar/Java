package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.DeliveryService;

public class AmazonDelivery implements DeliveryService {
    public void pickUp() {
        System.out.println("Package picked up.");
    }
    public void track() {
        System.out.println("Tracking in progress...");
    }
    public void deliver() {
        System.out.println("Package delivered.");
    }
    @Override
    public void greetCustomer() {
        System.out.println("Hello! Thank you for choosing Amazon Delivery.");
    }
}
