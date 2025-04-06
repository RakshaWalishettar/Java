package com.xworkz.Inheritance.external.Runner;


import com.xworks.Inheritance.external.Grocery;
import com.xworks.Inheritance.external.Product;

public class GroceryRunner {
    public static void main(String[] args) {
        Grocery grocery = new Grocery();
        grocery.getStockQuantity();
        grocery.getPrice();
        grocery.getName();
        grocery.getExpiryDate();
        grocery.getCategory();

        System.out.println("===========================");
        Product product1 = new Product();
        product1.getCategory();
        product1.getExpiryDate();
        product1.getName();
        product1.getStockQuantity();
        product1.getPrice();
    }
}
