package com.xworks.Inheritance.external;

public class Stand extends Table{
    public void stand() {
        System.out.println("No-args constructor for Stand");
    }

    {
        super.expand();
        System.out.println("Stand is expanding...");
    }

    {
        super.fold();
        System.out.println("Stand is folding...");
    }

    {
        super.supportObjects();
        System.out.println("Stand is supporting objects...");
    }

    {
        super.adjustHeight();
        System.out.println("Stand height is being adjusted...");
    }

    {
        super.decorate();
        System.out.println("Stand is being decorated...");
    }
}
