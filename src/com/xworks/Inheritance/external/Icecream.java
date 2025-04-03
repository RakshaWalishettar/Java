package com.xworks.Inheritance.external;

public class Icecream extends Cold{
    public void iceCream() {
        System.out.println("IceCream instance created.");
    }

    {
        super.freeze();
        System.out.println("IceCream is frozen.");
    }

    {
        super.scoop();
        System.out.println("IceCream is scooped.");
    }

    {
        super.melt();
        System.out.println("IceCream is melting.");
    }

    {
        super.flavorMix();
        System.out.println("IceCream is mixing flavors.");
    }

    {
        super.eat();
        System.out.println("IceCream is being eaten.");
    }
}
