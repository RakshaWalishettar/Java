package com.xworks.Inheritance.external;

public class Flower extends Plant{
    public void flower() {
        System.out.println("no-args const Flower");
    }

    {
        super.grow();
        System.out.println("Flower is growing...");
    }

    {
        super.photosynthesize();
        System.out.println("Flower is photosynthesizing...");
    }

    {
        super.absorbWater();
        System.out.println("Flower is absorbing water...");
    }

    {
        super.releaseOxygen();
        System.out.println("Flower is releasing oxygen...");
    }

    {
        super.bloom();
        System.out.println("Flower is blooming...");
    }
}
