package com.xworks.Inheritance.external;

public class Poet extends Write{
    public Poet() {
        System.out.println("No-args constructor Poet");
    }

    {
        super.write();
        System.out.println("Poet is writing poetry...");
    }

    {
        super.edit();
        System.out.println("Poet is editing poetry...");
    }

    {
        super.publish();
        System.out.println("Poet is publishing poetry...");
    }

    {
        super.research();
        System.out.println("Poet is researching themes...");
    }

    {
        super.read();
        System.out.println("Poet is reading literature...");
    }
}
