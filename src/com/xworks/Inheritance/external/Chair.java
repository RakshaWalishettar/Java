package com.xworks.Inheritance.external;

public class Chair extends Furniture{
    public Chair() {
        System.out.println("Chair instance created");
    }

    {
        super.move();
        System.out.println("Chair is being moved...");
    }

    {
        super.supportWeight();
        System.out.println("Chair is supporting weight...");
    }

    {
        super.adjustHeight();
        System.out.println("Chair height is being adjusted...");
    }

    {
        super.rotate();
        System.out.println("Chair is rotating...");
    }

    {
        super.fold();
        System.out.println("Chair is being folded...");
    }
}
