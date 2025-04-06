package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Apartment;
import com.xworks.Inheritance.external.StudioApartment;

public class StudioApartmentRunner {
    public static void main(String[] args) {
        StudioApartment studioApartment= new StudioApartment();
        studioApartment.useElectricity();
        studioApartment.provideShelter();
        studioApartment.useWater();
        studioApartment.payRent();
        studioApartment.maintainApartment();

        System.out.println("===================================");
        Apartment apartment = new Apartment();
        apartment.maintainApartment();
        apartment.payRent();
        apartment.provideShelter();
        apartment.useElectricity();
        apartment.useWater();
    }
}
