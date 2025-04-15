package com.xworkz.HybridInheritance;

public interface Loader {
    void loadGoods();
}

interface Tracker {
    void trackDelivery();
}

class DeliveryAgent implements Loader, Tracker {
    public void loadGoods() {
        System.out.println("Loading packages onto delivery vehicle");
    }

    public void trackDelivery() {
        System.out.println("Tracking package in real-time");
    }

    public static void main(String[] args) {
        DeliveryAgent da = new DeliveryAgent();
        da.loadGoods();
        da.trackDelivery();
    }
}
