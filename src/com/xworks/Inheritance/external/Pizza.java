package com.xworks.Inheritance.external;

public class Pizza extends Food{
    {
        super.bake();
        System.out.println("Pizza is being baked");
    }

    {
        super.addToppings();
        System.out.println("Adding toppings to Pizza");
    }

    {
        super.slice();
        System.out.println("Slicing the Pizza");
    }

    {
        super.serve();
        System.out.println("Serving the Pizza");
    }

    {
        super.eat();
        System.out.println("Eating the Pizza");
    }
}
