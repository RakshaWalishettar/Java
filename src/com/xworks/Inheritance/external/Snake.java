package com.xworks.Inheritance.external;

public class Snake extends Reptile {
    public void snake() {
        System.out.println("no-args const Snake");
    }

    {
        super.regulate_temperature();
        System.out.println("Snake is regulate_temperature ...");
    }

    {
        super.move();
        System.out.println("Snake is move...");
    }

    {
        super.eat();
        System.out.println("Snake is eat..");
    }

    {
        super.sleep();
        System.out.println("Snake is sleep.");
    }

    {
        super.shed_skin();
        System.out.println("Snake shed_skin.");
    }
}
