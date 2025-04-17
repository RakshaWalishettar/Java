package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.PastryChef;
import com.xworkz.Connection.internal.Chef;

public class PastryChefRunner {
    public static void main(String[] args) {
        Chef chef = new PastryChef();
        chef.prepareIngredients();
        chef.cook();
        chef.serveDish();
        chef.sweet();
    }
}
