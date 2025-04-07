package com.xworks.Inheritance.external;

public class LunchBag extends School {
    public void box() {
        System.out.println("the school has tiffin bag");
    }
    public void napkin(School school){
        school.carryBooks();
        school.carryWaterBottle();
        school.carryLaptop();
        school.carryStationery();
        school.carryLunch();


        if(school instanceof LunchBag){
            LunchBag lunchBag=(LunchBag) school;
            System.out.println("the tiffin box ");
            lunchBag.box();

        }
    }
}
