package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Bungalow;
import com.xworks.Inheritance.external.House;

public class BungalowRunner {
    public static void main(String[] args) {
        House house1 = new House();
        house1.turnOnLights();
        house1.openDoor();
        house1.lockMainGate();
        house1.closeWindow();
        house1.paintWalls();

        System.out.println("======================");

        Bungalow bungalow=new Bungalow();
        bungalow.paintWalls();
        bungalow.closeWindow();
        bungalow.openDoor();
        bungalow.lockMainGate();
        bungalow.turnOnLights();
    }
}
