package com.xworks.Inheritance.external;

public class Type extends Shoes{
    public void type() {
        System.out.println("Type of shoes is specified.");
    }

    {
        super.wear();
        System.out.println("Type is being worn...");
    }

    {
        super.cleaning();
        System.out.println("Type is being cleaned...");
    }

    {
        super.polish();
        System.out.println("Type is being polished...");
    }

    {
        super.tieLaces();
        System.out.println("Type laces are being tied...");
    }

    {
        super.remove();
        System.out.println("Type is being removed...");
    }

}
