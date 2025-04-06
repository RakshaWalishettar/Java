package com.xworks.Inheritance.external;

public class Mammals extends Dog{
    public Mammals()
    {
        System.out.println("no-args const of fullstack");
    }
    public void dog(){
        System.out.println("runner dog of fullstack");
    }@Override
    public void breathing(){
        System.out.println("runner breathing of fullstack");
    }@Override
    public void eating(){
        System.out.println("runner eating of fullstack");
    }@Override
    public void sleeping(){
        System.out.println("runner sleeping of fullstack");
    }@Override
    public void barking(){
        System.out.println("runner barking of fullstack");
    }@Override
    public void wagging(){
        System.out.println("runner wagging of fullstack");
    }
}
