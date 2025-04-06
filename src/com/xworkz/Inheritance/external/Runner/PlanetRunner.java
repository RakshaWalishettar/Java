package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Planet;
import com.xworks.Inheritance.external.SpaceObject;

public class PlanetRunner {
    public static void main(String [] args){
        SpaceObject spaceObject=new SpaceObject();
        spaceObject.supportLife();
        spaceObject.rotate();
        spaceObject.orbitSun();
        spaceObject.haveGravity();
        spaceObject.revolve();

        System.out.println("=========================");
        Planet planet=new Planet();
        planet.supportLife();
        planet.rotate();
        planet.orbitSun();
        planet.haveGravity();
        planet.revolve();
    }
}
