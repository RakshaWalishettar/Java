package com.xworkz.HierarchicalInheritance;

public class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Car plays music");
    }
}

class Bike extends Vehicle {
    void popWheelie() {
        System.out.println("Bike pops a wheelie");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.playMusic();

        Bike bike = new Bike();
        bike.start();
        bike.popWheelie();
    }
}
