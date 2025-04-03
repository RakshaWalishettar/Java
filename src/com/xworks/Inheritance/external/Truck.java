package com.xworks.Inheritance.external;

public class Truck extends PickupTruck {
    public void T()
    {
        System.out.println("no-args const of car");
    }
    {
        super.openCargoBed();
        System.out.println("runner openCargoBed of truck");
    }
    {
        super.closeCargoBed();
        System.out.println("runner closeCargoBed of truck");
    }
    {
        super.toggleCover();
        System.out.println("runner toggleCover of truck");
    }
    {
        super.enableOffRoadMode();
        System.out.println("runner enableOffRoadMode of truck");
    }
    {
        super.towTrailer();
        System.out.println("runner towTrailer of truck");
    }
}
