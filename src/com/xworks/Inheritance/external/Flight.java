package com.xworks.Inheritance.external;

public class Flight extends Transport{
    public Flight() {
        System.out.println("Train is being initialized");
    }
    @Override
    public void move(){
        System.out.println("Train is moving on tracks");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void fuel(){
        System.out.println("Train is refueling at station");
    }
    @Override
    public void stop(){
        System.out.println("Train is stopping at a station");
    }
    @Override
    public void capacity(){
        System.out.println("Train has passenger capacity");
    }
    @Override
    public void service(){
        System.out.println("Train is undergoing maintenance");
    }
    public void crash(){
        System.out.println("the runner crash");
    }
}
