package com.xworkz.inheritance.external;

public class Animal extends Mammal{
    public void Animal()
    {
        System.out.println("no-args const of Animal");
    }
    {
        super.mammal();
        System.out.println("runner designer of Animal");
    }
    {
        super.walk();
        System.out.println("runner walk of Animal");
    }
    {
        super.giveBirth();
        System.out.println("runner giveBirth of Animal");
    }
    {
        super.eat();
        System.out.println("runner eat of Animal");
    }
    {
        super.sleep();
        System.out.println("runner sleep of Animal");
    }
    {
        super.makeSound();
        System.out.println("runner makeSound of Animal");
    }
}
