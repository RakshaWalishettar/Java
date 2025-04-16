package com.xworkz.Connection.Main.Connection.external;

import com.xworkz.Connection.internal.Restaurant;

public class McDonalds implements Restaurant {
    public void takeOrder() {
        System.out.println("Order taken at McDonald's.");
    }
    public void prepareFood() {
        System.out.println("Preparing your burger...");
    }
    public void serveFood() {
        System.out.println("Food served. Enjoy!");
    }
}
