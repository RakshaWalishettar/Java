package com.xworks.Inheritance.external;

public class MetroTrain extends Train{
    public MetroTrain() {
        System.out.println("MetroTrain is ready for operation.");
    }
    {
        super.startJourney();
        System.out.println("MetroTrain is starting with an automated system.");
    }
    {
        super.stopAtStation();
        System.out.println("MetroTrain stops with precision docking.");
    }
    {
        super.accelerate();
        System.out.println("MetroTrain accelerates smoothly.");
    }
    {
        super.decelerate();
        System.out.println("MetroTrain decelerates efficiently.");
    }
    {
        super.announceArrival();
        System.out.println("MetroTrain announces arrival with an automated voice system.");
    }
}
