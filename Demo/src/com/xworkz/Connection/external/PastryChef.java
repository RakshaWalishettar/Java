package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Chef;

public class PastryChef implements Chef {
    public void prepareIngredients() {
        System.out.println("Ingredients for pastry prepared.");
    }
    public void cook() {
        System.out.println("Baking the pastry...");
    }
    public void serveDish() {
        System.out.println("Pastry served!");
    }
}
