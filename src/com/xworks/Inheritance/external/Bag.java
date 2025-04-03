package com.xworks.Inheritance.external;

public class Bag extends School{
    public void bag() {
        System.out.println("No-args constructor of Bag.");
    }

    {
        super.carryBooks();
        System.out.println("Bag is carrying books...");
    }

    {
        super.carryLunch();
        System.out.println("Bag is carrying lunch...");
    }

    {
        super.carryStationery();
        System.out.println("Bag is carrying stationery...");
    }

    {
        super.carryLaptop();
        System.out.println("Bag is carrying a laptop...");
    }

    {
        super.carryWaterBottle();
        System.out.println("Bag is carrying a water bottle...");
    }
}
