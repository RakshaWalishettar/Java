package com.xworks.Inheritance.external;

public class Mansion extends Building{
    public Mansion() {
        System.out.println("Mansion: No-args constructor");
    }

    {
        super.provideShelter();
        System.out.println("Mansion provides luxurious shelter...");
    }

    {
        super.lockDoors();
        System.out.println("Mansion has secure doors...");
    }

    {
        super.openWindows();
        System.out.println("Mansion has large open windows...");
    }

    {
        super.haveRooms();
        System.out.println("Mansion has many spacious rooms...");
    }

    {
        super.insulate();
        System.out.println("Mansion has premium insulation...");
    }
}
