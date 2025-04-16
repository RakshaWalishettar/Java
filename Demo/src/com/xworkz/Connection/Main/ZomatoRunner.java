package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Zomato;
import com.xworkz.Connection.internal.FoodDelivery;

public class ZomatoRunner {
    public static void main(String[] args) {
        FoodDelivery fd = new Zomato();
        fd.placeOrder();
        fd.trackOrder();
        fd.receiveOrder();
    }
}
