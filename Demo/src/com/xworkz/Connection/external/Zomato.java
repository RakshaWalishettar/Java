package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.FoodDelivery;

public class Zomato implements FoodDelivery {
    public void placeOrder() {
        System.out.println("Food order placed on Zomato.");
    }

    public void trackOrder() {
        System.out.println("Tracking Zomato order...");
    }

    public void receiveOrder() {
        System.out.println("Order received from Zomato.");
    }
    @Override
    public void deliveryfood() {
        System.out.println("Welcome!");
    }
}
