package com.xworks.Inheritance.external;

public class CruiseShip extends Ship{
    public CruiseShip() {
        System.out.println("CruiseShip is ready for luxury travel.");
    }

    {
        super.sail();
        System.out.println("CruiseShip is sailing smoothly.");
    }

    {
        super.navigate();
        System.out.println("CruiseShip is using GPS navigation.");
    }

    {
        super.dockAtPort();
        System.out.println("CruiseShip docks at a luxury port.");
    }

    {
        super.provideCabins();
        System.out.println("CruiseShip offers premium cabins.");
    }

    {
        super.hostEvents();
        System.out.println("CruiseShip hosts entertainment events.");
    }
}
