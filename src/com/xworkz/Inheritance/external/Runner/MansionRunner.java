package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Building;
import com.xworks.Inheritance.external.Mansion;

public class MansionRunner {
    public static void main(String[] args) {
        Mansion mansion= new Mansion();
        mansion.openWindows();
        mansion.lockDoors();
        mansion.insulate();
        mansion.provideShelter();
        mansion.haveRooms();

        System.out.println("===================================");
        Building building = new Building();
        building.provideShelter();
        building.openWindows();
        building.lockDoors();
        building.insulate();
        building.haveRooms();
    }
}
