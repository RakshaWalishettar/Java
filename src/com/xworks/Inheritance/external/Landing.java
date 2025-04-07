package com.xworks.Inheritance.external;

public class Landing extends Aircraft{
    public void fans(){
        System.out.println("it has the fans to fly");
    }
    public void limiseat(Aircraft aircraft){
        aircraft.land();
        aircraft.refuel();
        aircraft.fly();
        aircraft.hover();
        aircraft.loadPassengers();

        if(aircraft instanceof Landing){
            Landing landing=(Landing) aircraft;
            System.out.println("the instance of the aircraft is landing");
            landing.fans();
        }
    }
}
