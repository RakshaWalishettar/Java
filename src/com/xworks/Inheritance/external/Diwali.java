package com.xworks.Inheritance.external;

public class Diwali extends Festival{
    public void diwali() {
        System.out.println("no-args constructor Diwali");
    }

    {
        super.lightLamps();
        System.out.println("Diwali: Lighting diyas");
    }

    {
        super.burstCrackers();
        System.out.println("Diwali: Enjoying fireworks");
    }

    {
        super.pray();
        System.out.println("Diwali: Performing Lakshmi Puja");
    }

    {
        super.distributeSweets();
        System.out.println("Diwali: Sharing sweets with loved ones");
    }

    {
        super.visitRelatives();
        System.out.println("Diwali: Meeting family and friends");
    }
}
