package com.xworks.Inheritance.external;

public class Animal extends Mammal{
    public Animal()
    {
        System.out.println("no-args const of Animal");
    }
    @Override
    public void mammal(){
        System.out.println("runner designer of Animal");
    }
    @Override
    public void walk(){
        System.out.println("runner walk of Animal");
    }
    @Override
    public void giveBirth(){
        System.out.println("runner giveBirth of Animal");
    }
    @Override
    public void eat(){
        System.out.println("runner eat of Animal");
    }@Override
    public void sleep(){
        System.out.println("runner sleep of Animal");
    }@Override
    public void makeSound(){
        System.out.println("runner makeSound of Animal");
    }
}
