package com.xworks.Inheritance.external;

public class Plaer extends Cricket{
    public void  batsman() {
        System.out.println("Batsman no-arg constructor");
    }

    {
        super.play();
        System.out.println("Batsman plays cricket...");
    }

    {
        super.batting();
        System.out.println("Batsman specializes in batting...");
    }

    {
        super.fielding();
        System.out.println("Batsman is fielding...");
    }

    {
        super.practice();
        System.out.println("Batsman practices hard...");
    }

    {
        super.rest();
        System.out.println("Batsman takes rest after training...");
    }
}
