package com.xworks.Inheritance.external;

public class Grocery extends Product {
    public Grocery() {
        System.out.println("Grocery Constructor Called");
    }

    {
        super.getName();
        System.out.println("Grocery Name: Fresh Apples");
    }

    {
        super.getPrice();
        System.out.println("Grocery Price: $2.99 per lb");
    }

    {
        super.getCategory();
        System.out.println("Grocery Category: Food");
    }

    {
        super.getExpiryDate();
        System.out.println("Grocery Expiry Date: 10 Days from Manufacture");
    }

    {
        super.getStockQuantity();
        System.out.println("Grocery Stock Quantity: 500");
    }

}
