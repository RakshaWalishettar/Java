package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Food;
import com.xworks.Inheritance.external.Pizza;

public class PizzaRunne {
    public static void main(String[] args) {
        Food food= new Food();
        food.slice();
        food.serve();
        food.bake();
        food.addToppings();
        food.eat();

        System.out.println("==========================");
        Pizza pizza= new Pizza();
        pizza.addToppings();
        pizza.bake();
        pizza.eat();
        pizza.serve();
        pizza.slice();
    }
}
