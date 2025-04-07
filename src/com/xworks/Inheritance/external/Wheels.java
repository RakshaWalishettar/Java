package com.xworks.Inheritance.external;

public class Wheels extends Bicycle{
    public void fourWheels() {
        System.out.println("the bicycle runs in road");
    }
    public void peddel(Bicycle bicycle){
        bicycle.load();
        bicycle.stop();
        bicycle.move();
        bicycle.maintain();
        bicycle.fuel();

        if(bicycle instanceof Wheels){
            Wheels wheels=(Wheels) bicycle;
            System.out.println("the bicycle has 4 wheels");
            wheels.fourWheels();
        }
    }
}
