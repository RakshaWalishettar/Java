package com.xworks.Inheritance.external;

public class Cup extends  Drink{
    public void sugar() {
        System.out.println("the sugar is added to the cup");
    }
    public void hot(Drink drink){
        drink.sweeten();
        drink.pour();
        drink.brew();
        drink.addMilk();
        drink.sweeten();

        if(drink instanceof Cup){
            Cup cup=(Cup) drink;
            System.out.println("cup is the instance of the drink");
            cup.sugar();

        }
    }
}
