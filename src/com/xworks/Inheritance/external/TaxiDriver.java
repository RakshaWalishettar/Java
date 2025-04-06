package com.xworks.Inheritance.external;

public class TaxiDriver extends Driver{
    public TaxiDriver() {
        System.out.println("No-args constructor TaxiDriver");
    }

    @Override
    public void drive(){
        System.out.println("TaxiDriver is driving...");
    }

    @Override
    public void navigate(){
        System.out.println("TaxiDriver is navigating...");
    }

    @Override
    public void pickUpPassenger(){
        System.out.println("TaxiDriver is picking up a passenger...");
    }

    @Override
    public void dropOffPassenger(){
        System.out.println("TaxiDriver is dropping off a passenger...");
    }

    @Override
    public void calculateFare(){
        System.out.println("TaxiDriver is calculating fare...");
    }

}
