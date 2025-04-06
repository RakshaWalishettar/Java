package com.xworks.Inheritance.external;

public class MetroTrain extends Train{
    public MetroTrain() {
        System.out.println("MetroTrain is ready for operation.");
    }@Override
    public void startJourney(){
        System.out.println("MetroTrain is starting with an automated system.");
    }@Override
    public void stopAtStation(){
        System.out.println("MetroTrain stops with precision docking.");
    }@Override
    public void accelerate(){
        System.out.println("MetroTrain accelerates smoothly.");
    }@Override
    public void decelerate(){
        System.out.println("MetroTrain decelerates efficiently.");
    }@Override
    public void announceArrival(){
        System.out.println("MetroTrain announces arrival with an automated voice system.");
    }
}
