package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Bag;
import com.xworks.Inheritance.external.School;

public class BagRunner {
    public static void main(String[] args) {
        School school = new School();
        school.carryStationery();
        school.carryLunch();
        school.carryWaterBottle();
        school.carryLaptop();
        school.carryStationery();

        System.out.println("================");

        Bag bag=new Bag();
        bag.carryWaterBottle();
        bag.carryStationery();
        bag.carryBooks();
        bag.carryLunch();
        bag.carryLaptop();

    }
}
