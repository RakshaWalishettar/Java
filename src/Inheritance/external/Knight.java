package com.xworkz.inheritance.external;

public class Knight extends Warrior{
    public Knight() {
        super();
        System.out.println("No-args constructor of Knight");
    }

    {
        super.fighting();
        System.out.println("Knight is fighting with honor");
    }

    {
        super.defending();
        System.out.println("Knight is defending the kingdom");
    }

    {
        super.riding();
        System.out.println("Knight is riding a horse");
    }

    {
        super.training();
        System.out.println("Knight is training for battle");
    }

    {
        super.strategizing();
        System.out.println("Knight is planning warfare strategies");
    }

}
