package com.xworks.Inheritance.external;

public class Grocery extends Product {
    public Grocery() {
        System.out.println("Grocery Constructor Called");
    }

    @Override
    public void getName(){
        System.out.println("Grocery Name: Fresh Apples");
    }

    @Override
    public void getPrice(){
        System.out.println("Grocery Price: $2.99 per lb");
    }

    @Override
    public void getCategory(){
        System.out.println("Grocery Category: Food");
    }

    @Override
    public void getExpiryDate(){
        System.out.println("Grocery Expiry Date: 10 Days from Manufacture");
    }

    @Override
    public void getStockQuantity(){
        System.out.println("Grocery Stock Quantity: 500");
    }
    public void customer(){
        System.out.println("the runner customer");
    }

}
