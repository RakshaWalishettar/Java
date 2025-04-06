package com.xworks.Inheritance.external;

public class Mansion extends Building{
    public Mansion() {
        System.out.println("Mansion: No-args constructor");
    }
    @Override
    public void provideShelter(){
        System.out.println("Mansion provides luxurious shelter...");
    }
    @Override
    public void lockDoors(){
        System.out.println("Mansion has secure doors...");
    }
    @Override
    public void openWindows(){
        System.out.println("Mansion has large open windows...");
    }
    @Override
    public void haveRooms(){
        System.out.println("Mansion has many spacious rooms...");
    }
    @Override
    public void insulate(){
        System.out.println("Mansion has premium insulation...");
    }
}
