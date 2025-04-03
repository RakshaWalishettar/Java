package com.xworks.Inheritance.external;

public class StudioApartment extends Apartment{
    public void studioApartment() {
        System.out.println("No-args constructor StudioApartment");
    }

    {
        super.provideShelter();
        System.out.println("StudioApartment provides compact shelter...");
    }

    {
        super.payRent();
        System.out.println("StudioApartment has lower rent...");
    }

    {
        super.useElectricity();
        System.out.println("StudioApartment uses less electricity...");
    }

    {
        super.useWater();
        System.out.println("StudioApartment consumes less water...");
    }

    {
        super.maintainApartment();
        System.out.println("StudioApartment requires minimal maintenance...");
    }
}
