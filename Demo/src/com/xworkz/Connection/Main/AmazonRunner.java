package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.AmazonDelivery;
import com.xworkz.Connection.internal.DeliveryService;

public class AmazonRunner {
    public static void main(String[] args) {
        DeliveryService ds = new AmazonDelivery();
        ds.pickUp();
        ds.track();
        ds.deliver();
    }
}
