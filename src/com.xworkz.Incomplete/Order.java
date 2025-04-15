package com.xworkz.Incomplete;

public abstract class Order {
    int orderId;
    String product;
    int quantity;
    double price;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId, String product) {
        this(orderId);
        this.product = product;
    }
    public Order(int orderId, String product, int quantity, double price) {
        this(orderId, product);
        this.quantity = quantity;
        this.price = price;
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId + ", Product: " + product +
                ", Qty: " + quantity + ", Price: $" + price);
    }
}
