package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.CruiseShip;
import com.xworks.Inheritance.external.Ship;

public class CruiseRunner {
    public static void main(String[] args) {
        CruiseShip cruiseShip = new CruiseShip();
        cruiseShip.provideCabins();
        cruiseShip.navigate();
        cruiseShip.sail();
        cruiseShip.hostEvents();
        cruiseShip.dockAtPort();

        System.out.println("==================================");

        Ship ship1 = new Ship();
        ship1.provideCabins();
        ship1.navigate();
        ship1.hostEvents();
        ship1.sail();
        ship1.dockAtPort();
    }
}
