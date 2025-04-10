package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Car;

public class CarRunner {
    public static void main(String[] args){
        Car car=new Car("Deffender","Land Rover",276);
        System.out.println(car);

        int code = car.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(car));
    }

}
