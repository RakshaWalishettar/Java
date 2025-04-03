package com.xworks.Inheritance.external;

public class Hammer extends Tool{
    public void  Hammer() {
        System.out.println("Hammer created.");
    }

    {
        super.use();
        System.out.println("Hammer is striking.");
    }

    {
        super.carry();
        System.out.println("Hammer is lifted.");
    }

    {
        super.store();
        System.out.println("Hammer is dropped.");
    }

    {
        super.repair();
        System.out.println("Hammer is being repaired.");
    }

    {
        super.store();
        System.out.println("Hammer is stored safely.");
    }
}
