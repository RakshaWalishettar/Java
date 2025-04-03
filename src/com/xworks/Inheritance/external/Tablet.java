package com.xworks.Inheritance.external;

public class Tablet extends Antibiotic{
    public Tablet() {
        System.out.println("Tablet created (no-args constructor).");
    }

    {
        super.killBacteria();
        System.out.println("Tablet form is helping to kill bacteria.");
    }

    {
        super.treatInfections();
        System.out.println("Tablet is treating infections...");
    }

    {
        super.reduceFever();
        System.out.println("Tablet is reducing fever...");
    }

    {
        super.increaseImmunity();
        System.out.println("Tablet is increasing immunity...");
    }

    {
        super.manageDosage();
        System.out.println("Tablet is managing the correct dosage.");
    }
}
