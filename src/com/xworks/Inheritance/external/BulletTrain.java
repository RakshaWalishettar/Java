package com.xworks.Inheritance.external;

public class BulletTrain extends Schedule{
    public void bulletTrain() {
        System.out.println("BulletTrain: No-args constructor.");
    }

    {
        super.startJourney();
        System.out.println("BulletTrain: Starting journey...");
    }

    {
        super.reachHighSpeed();
        System.out.println("BulletTrain: Reaching high speed...");
    }

    {
        super.passTunnels();
        System.out.println("BulletTrain: Passing through tunnels...");
    }

    {
        super.slowDown();
        System.out.println("BulletTrain: Slowing down...");
    }

    {
        super.stopAtStation();
        System.out.println("BulletTrain: Stopping at the station...");
    }
}
