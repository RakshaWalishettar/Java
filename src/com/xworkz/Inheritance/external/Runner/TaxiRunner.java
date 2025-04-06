package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Driver;
import com.xworks.Inheritance.external.TaxiDriver;

public class TaxiRunner {
    public static void main(String[] args) {
        TaxiDriver taxiDriver = new TaxiDriver();
        taxiDriver.pickUpPassenger();
        taxiDriver.navigate();
        taxiDriver.dropOffPassenger();
        taxiDriver.calculateFare();


        System.out.println("================================");
        Driver driver = new Driver();
        driver.calculateFare();
        driver.dropOffPassenger();
        driver.navigate();
        driver.pickUpPassenger();
    }
}
