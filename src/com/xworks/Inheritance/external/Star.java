package com.xworks.Inheritance.external;

public class Star extends Sky{
    public void star() {
        System.out.println("No-args constructor Star");
    }

    {
        super.emitLight();
        System.out.println("Star is emitting light...");
    }

    {
        super.generateHeat();
        System.out.println("Star is generating heat...");
    }

    {
        super.fuseHydrogen();
        System.out.println("Star is fusing hydrogen...");
    }

    {
        super.explodeSupernova();
        System.out.println("Star is exploding into a supernova...");
    }

    {
        super.collapse();
        System.out.println("Star is collapsing...");
    }
}
