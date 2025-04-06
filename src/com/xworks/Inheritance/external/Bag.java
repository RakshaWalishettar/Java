package com.xworks.Inheritance.external;

public class Bag extends School{
    public Bag() {
        System.out.println("No-args constructor of Bag.");
    }
    @Override
    public void carryBooks(){
        System.out.println("Bag is carrying books...");
    }
    @Override
    public void carryLunch(){
        System.out.println("Bag is carrying lunch...");
    }
    @Override
    public void carryStationery(){
        System.out.println("Bag is carrying stationery...");
    }
    @Override
    public void carryLaptop(){
        System.out.println("Bag is carrying a laptop...");
    }
    @Override
    public void carryWaterBottle(){
        System.out.println("Bag is carrying a water bottle...");
    }
}
