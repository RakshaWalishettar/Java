package com.xworks.Inheritance.external;

public class Summer extends Hot{
    public void summer() {
        System.out.println("Summer: No-args constructor.");
    }

    {
        super.temperatureRise();
        System.out.println("Summer: Days get hotter.");
    }

    {
        super.sunBurn();
        System.out.println("Summer: Skin burns easily.");
    }

    {
        super.dehydration();
        System.out.println("Summer: Drink more water.");
    }

    {
        super.heatwaves();
        System.out.println("Summer: Heatwaves affect daily life.");
    }

    {
        super.sweating();
        System.out.println("Summer: Excessive sweating occurs.");
    }
}
