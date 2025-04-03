package com.xworks.Inheritance.external;

public class Branches extends Tree{
    public void branches() {
        System.out.println("Branches are part of the tree.");
    }

    {
        super.growLeaves();
        System.out.println("Branches help grow leaves.");
    }

    {
        super.provideShade();
        System.out.println("Branches contribute to shade.");
    }

    {
        super.bearFruit();
        System.out.println("Branches hold and support fruit.");
    }

    {
        super.absorbCO2();
        System.out.println("Branches help in CO2 absorption.");
    }

    {
        super.supportWildlife();
        System.out.println("Branches provide shelter for wildlife.");
    }
}
