package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Fish;
import com.xworks.Inheritance.external.Shark;

public class SharkRunner {
    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.sleep();
        shark.swim();
        shark.hunt();
        shark.breatheUnderwater();
        shark.eat();

        System.out.println("=======================================");
        Fish fish = new Fish();
        fish.sleep();
        fish.swim();
        fish.breatheUnderwater();
        fish.hunt();
        fish.eat();
    }
}
