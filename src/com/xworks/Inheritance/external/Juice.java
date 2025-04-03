package com.xworks.Inheritance.external;

public class Juice extends Fruit{
    {
        super.extract();
        System.out.println("Juice extraction completed.");
    }

    {
        super.blend();
        System.out.println("Juice is blended smoothly.");
    }

    {
        super.serveCold();
        System.out.println("Juice is served cold.");
    }

    {
        super.addIce();
        System.out.println("Juice with ice is ready.");
    }

    {
        super.drink();
        System.out.println("Enjoy your fresh juice!");
    }
}
