package com.xworks.Inheritance.external;

public class Truck extends PickupTruck {
    public Truck()
    {
        System.out.println("no-args const of car");
    }
    @Override
    public void openCargoBed(){;
        System.out.println("runner openCargoBed of truck");
    }
    @Override
    public void closeCargoBed(){
        System.out.println("runner closeCargoBed of truck");
    }
    @Override
    public void toggleCover(){
        System.out.println("runner toggleCover of truck");
    }
    @Override
    public void enableOffRoadMode(){
        System.out.println("runner enableOffRoadMode of truck");
    }
    @Override
    public void towTrailer(){
        System.out.println("runner towTrailer of truck");
    }
}
