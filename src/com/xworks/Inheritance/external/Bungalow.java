package com.xworks.Inheritance.external;

public class Bungalow extends House{
    public void bungalow() {
        System.out.println("no-args const Bungalow");
    }
    @Override
    public  void openDoor(){
        System.out.println("Bungalow: Opening the door...");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void closeWindow(){
        System.out.println("Bungalow: Closing the window...");
    }
    @Override
    public void turnOnLights(){
        System.out.println("Bungalow: Turning on the lights...");
    }
    @Override
    public void lockMainGate(){
        System.out.println("Bungalow: Locking the main gate...");
    }
    @Override
    public void paintWalls(){
        System.out.println("Bungalow: Painting the walls...");
    }
}
