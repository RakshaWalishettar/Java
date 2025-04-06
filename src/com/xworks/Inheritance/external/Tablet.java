package com.xworks.Inheritance.external;

public class Tablet extends Antibiotic{
    public Tablet() {
        System.out.println("Tablet created (no-args constructor).");
    }

    @Override
    public void killBacteria(){
        System.out.println("Tablet form is helping to kill bacteria.");
    }

    @Override
    public void treatInfections(){
        System.out.println("Tablet is treating infections...");
    }

    @Override
    public void reduceFever(){
        System.out.println("Tablet is reducing fever...");
    }

    @Override
    public void increaseImmunity(){
        System.out.println("Tablet is increasing immunity...");
    }

    @Override
    public void manageDosage(){
        System.out.println("Tablet is managing the correct dosage.");
    }
}
