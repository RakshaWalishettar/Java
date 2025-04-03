package com.xworks.Inheritance.external;

public class Coffee extends Drink{
    public Coffee() {
        System.out.println("No-args constructor for Coffee");
    }

    {
        super.brew();
        System.out.println("Brewing coffee...");
    }

    {
        super.pour();
        System.out.println("Pouring coffee...");
    }

    {
        super.addMilk();
        System.out.println("Adding milk to coffee...");
    }

    {
        super.sweeten();
        System.out.println("Sweetening coffee...");
    }

    {
        super.drink();
        System.out.println("Drinking coffee...");
    }
}
