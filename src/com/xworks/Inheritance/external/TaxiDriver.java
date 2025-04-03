package com.xworks.Inheritance.external;

public class TaxiDriver extends Driver{
    public TaxiDriver() {
        System.out.println("No-args constructor TaxiDriver");
    }

    {
        super.drive();
        System.out.println("TaxiDriver is driving...");
    }

    {
        super.navigate();
        System.out.println("TaxiDriver is navigating...");
    }

    {
        super.pickUpPassenger();
        System.out.println("TaxiDriver is picking up a passenger...");
    }

    {
        super.dropOffPassenger();
        System.out.println("TaxiDriver is dropping off a passenger...");
    }

    {
        super.calculateFare();
        System.out.println("TaxiDriver is calculating fare...");
    }

}
