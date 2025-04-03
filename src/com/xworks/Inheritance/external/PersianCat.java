package com.xworks.Inheritance.external;

public class PersianCat extends Cats{
    public PersianCat() {
        super();
        System.out.println("No-args constructor of PersianCat");
    }

    {
        super.breathing();
        System.out.println("PersianCat is breathing");
    }

    {
        super.eating();
        System.out.println("PersianCat is eating");
    }

    {
        super.sleeping();
        System.out.println("PersianCat is sleeping");
    }

    {
        super.meowing();
        System.out.println("PersianCat is meowing");
    }

    {
        super.purring();
        System.out.println("PersianCat is purring");
    }
}
