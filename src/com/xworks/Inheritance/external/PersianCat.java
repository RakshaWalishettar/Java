package com.xworks.Inheritance.external;

public class PersianCat extends Cats{
    public PersianCat() {
        System.out.println("No-args constructor of PersianCat");
    }
    @Override
    public void breathing(){
        System.out.println("PersianCat is breathing");
    }
    @Override
    public void eating(){
        System.out.println("PersianCat is eating");
    }
    @Override
    public void sleeping(){
        System.out.println("PersianCat is sleeping");
    }
    @Override
    public void meowing(){
        System.out.println("PersianCat is meowing");
    }
    @Override
    public void purring(){
        System.out.println("PersianCat is purring");
    }
}
