package com.xworks.Inheritance.external;

public class Water extends Ship{
    public void moves(){
        System.out.println("the ships move in water");
    }
    public void room(Ship ship){
        ship.sail();
        ship.dockAtPort();
        ship.hostEvents();
        ship.navigate();
        ship.provideCabins();

        if(ship instanceof Water){
            Water water=new Water();
            System.out.println("water instance of ship");
            water.moves();
        }

    }
}
