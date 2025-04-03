package com.xworks.Inheritance.external;

public class Bungalow extends House{
    public void bungalow() {
        System.out.println("no-args const Bungalow");
    }

    {
        super.openDoor();
        System.out.println("Bungalow: Opening the door...");
    }

    {
        super.closeWindow();
        System.out.println("Bungalow: Closing the window...");
    }

    {
        super.turnOnLights();
        System.out.println("Bungalow: Turning on the lights...");
    }

    {
        super.lockMainGate();
        System.out.println("Bungalow: Locking the main gate...");
    }

    {
        super.paintWalls();
        System.out.println("Bungalow: Painting the walls...");
    }
}
