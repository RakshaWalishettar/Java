package com.xworks.Inheritance.external;

public class Chips extends Snacks{
    public Chips() {
        System.out.println("Creating a Chips object.");
    }
    @Override
    public void openPacket(){
        System.out.println("Chips packet is opened.");
    }
    @Override
    public void crunch(){
        System.out.println("Chips are crunchy.");
    }
    @Override
    public void flavor(){
        System.out.println("Chips have a spicy flavor.");
    }
    @Override
    public void share(){
        System.out.println("Sharing chips with friends.");
    }
    @Override
    public void finish(){
        System.out.println("Chips are finished.");
    }
    public void masala(){
        System.out.println("running masala");
    }
}
