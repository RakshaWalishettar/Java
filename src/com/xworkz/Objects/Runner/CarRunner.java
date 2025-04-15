package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Car;

public class CarRunner {
    public static void main(String[] args){
        Car car1=new Car("Deffender","Land Rover",276);
        Car car2=new Car("Deffender","A",8693521);
        System.out.println(car1);

        System.out.println("the car has:"+(car1==car2));
        boolean same=car1.equals(car2);
        System.out.println("both car1 and car2 are same :"+same);


        int code = car1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(car1));
    }

}
