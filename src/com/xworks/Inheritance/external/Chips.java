package com.xworks.Inheritance.external;

public class Chips extends Snacks{
    public Chips() {
        System.out.println("Creating a Chips object.");
    }

    {
        super.openPacket();
        System.out.println("Chips packet is opened.");
    }

    {
        super.crunch();
        System.out.println("Chips are crunchy.");
    }

    {
        super.flavor();
        System.out.println("Chips have a spicy flavor.");
    }

    {
        super.share();
        System.out.println("Sharing chips with friends.");
    }

    {
        super.finish();
        System.out.println("Chips are finished.");
    }
}
