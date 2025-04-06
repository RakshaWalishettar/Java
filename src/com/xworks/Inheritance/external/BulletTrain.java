package com.xworks.Inheritance.external;

public class BulletTrain extends Schedule{
    public BulletTrain() {
        System.out.println("BulletTrain: No-args constructor.");
    }
    @Override
    public  void startJourney(){
        System.out.println("BulletTrain: Starting journey...");
    }
    @Override
    public void reachHighSpeed(){
        System.out.println("BulletTrain: Reaching high speed...");
    }
    @Override
    public void passTunnels(){
        System.out.println("BulletTrain: Passing through tunnels...");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void slowDown(){
        System.out.println("BulletTrain: Slowing down...");
    }
    @Override
    public void stopAtStation(){
        System.out.println("BulletTrain: Stopping at the station...");
    }
}
