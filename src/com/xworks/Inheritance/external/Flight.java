package com.xworks.Inheritance.external;

public class Flight extends Transport{
    public void flight() {
        System.out.println("Train is being initialized");
    }

    {
        super.move();
        System.out.println("Train is moving on tracks");
    }

    {
        super.fuel();
        System.out.println("Train is refueling at station");
    }

    {
        super.stop();
        System.out.println("Train is stopping at a station");
    }

    {
        super.capacity();
        System.out.println("Train has passenger capacity");
    }

    {
        super.service();
        System.out.println("Train is undergoing maintenance");
    }
}
