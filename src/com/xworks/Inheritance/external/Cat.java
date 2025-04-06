package com.xworks.Inheritance.external;

public class Cat extends Felidae{
    public Cat(){
        System.out.println("no args const of cat");
    }
    @Override
    public  void breathing(){
        System.out.println("Cat is breathing");
    }
    @Override
    public void eating(){
        System.out.println("Cat is eating");
    }
    @Override
    public void sleeping(){
        System.out.println("Cat is sleeping");
    }
    @Override
    public  void roaring(){
        System.out.println("Cat is meowing");
    }
    @Override
    public void hunting(){
        System.out.println("Cat is scratching");
    }
}
