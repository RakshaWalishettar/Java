package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.ItalianRestaurant;

public class ItalianRestaurantRunner {
    public static void main(String[] args) {
        ItalianRestaurant ir = new ItalianRestaurant();
        ir.open();
        ir.servePasta();
    }
}
