package com.xworks.Inheritance.external;

public class CruiseShip extends Ship{
    public CruiseShip() {
        System.out.println("CruiseShip is ready for luxury travel.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void sail(){
        System.out.println("CruiseShip is sailing smoothly.");
    }
    @Override
    public void navigate(){
        System.out.println("CruiseShip is using GPS navigation.");
    }
    @Override
    public void dockAtPort(){
        System.out.println("CruiseShip docks at a luxury port.");
    }
    @Override
    public void provideCabins(){
        System.out.println("CruiseShip offers premium cabins.");
    }
    @Override
    public void hostEvents(){
        System.out.println("CruiseShip hosts entertainment events.");
    }
    public void rooms(){
        System.out.println("runner the room");
    }
}
