package com.xworks.Inheritance.external;

public class StudioApartment extends Apartment{
    public StudioApartment() {
        System.out.println("No-args constructor StudioApartment");
    }

    @Override
    public void provideShelter(){
        System.out.println("StudioApartment provides compact shelter...");
    }

    @Override
    public void payRent(){
        System.out.println("StudioApartment has lower rent...");
    }

    @Override
    public void useElectricity(){
        System.out.println("StudioApartment uses less electricity...");
    }

    @Override
    public void useWater(){
        System.out.println("StudioApartment consumes less water...");
    }

    @Override
    public void maintainApartment(){
        System.out.println("StudioApartment requires minimal maintenance...");
    }
}
