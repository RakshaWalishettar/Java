package com.xworks.Inheritance.external;

public class Parrot extends Bird{
    public Parrot() {
        super();
        System.out.println("No-args constructor of Parrot");
    }
    {
    super.breathing();
        System.out.println("Parrot is breathing");
    }
    {
    super.eating();
        System.out.println("Parrot is eating");
    }
    {
    super.sleeping() ;
        System.out.println("Parrot is sleeping");
    }
    {
    super.flying() ;
        System.out.println("Parrot is flying");
    }
    {
    super.chirping();
        System.out.println("Parrot is chirping");
    }

}
