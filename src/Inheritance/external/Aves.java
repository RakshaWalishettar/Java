package com.xworkz.inheritance.external;

public class Aves extends Birds{
    public void Aves()
    {
        System.out.println("no-args const of Aves");
    }
    {
        super.birds();
        System.out.println("runner designer of Aves");
    }
    {
        super.fly();
        System.out.println("runner fly of Aves");
    }
    {
        super.sing();
        System.out.println("runner sing of Aves");
    }
    {
        super.buildNest();
        System.out.println("runner buildNest of Aves");
    }
    {
        super.migrate();
        System.out.println("runner migrate of Aves");
    }
    {
        super.eat();
        System.out.println("runner eat of Aves");
    }
}
