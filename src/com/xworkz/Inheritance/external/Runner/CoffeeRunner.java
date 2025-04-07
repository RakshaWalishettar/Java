package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Coffee;
import com.xworks.Inheritance.external.Cup;
import com.xworks.Inheritance.external.Drink;

public class CoffeeRunner {
    public static void main(String[] args){
        Drink drink=new Drink();
        drink.sweeten();
        drink.pour();
        drink.brew();
        drink.addMilk();
        drink.drink();

        System.out.println("=======================");
        Coffee coffee=new Coffee();
        coffee.sweeten();
        coffee.drink();
        coffee.addMilk();
        coffee.pour();
        coffee.brew();

        System.out.println("=======================");

        Cup cup=new Cup();
        cup.hot(drink);
        cup.hot(cup);
    }
}
