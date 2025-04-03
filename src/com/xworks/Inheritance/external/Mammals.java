package com.xworks.Inheritance.external;

public class Mammals extends Dog{
    public void mammals()
    {
        System.out.println("no-args const of fullstack");
    }
    {
        super.dog();
        System.out.println("runner dog of fullstack");
    }
    {
        super.breathing();
        System.out.println("runner breathing of fullstack");
    }
    {
        super.eating();
        System.out.println("runner eating of fullstack");
    }
    {
        super.sleeping();
        System.out.println("runner sleeping of fullstack");
    }
    {
        super.barking();
        System.out.println("runner barking of fullstack");
    }
    {
        super.wagging();
        System.out.println("runner wagging of fullstack");
    }
}
