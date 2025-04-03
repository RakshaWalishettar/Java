package com.xworks.Inheritance.external;

public class Cat extends Felidae{
    public Cat()
    {
        super();
        System.out.println("No-args constructor of Cat");
    }
    {
        super.breathing();
        System.out.println("Cat is breathing");
    }
    {
        super.eating();
        System.out.println("Cat is eating");
    }

    {
        super.sleeping();
        System.out.println("Cat is sleeping");
    }

    {
        super.roaring();
        System.out.println("Cat is meowing");
    }
    {

        super.hunting() ;
        System.out.println("Cat is scratching");
    }
}
