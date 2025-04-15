package com.xworkz.HierarchicalInheritance;

public class ZooAnimal {
    void feed() {
        System.out.println("Animal is being fed");
    }
}

class Lion extends ZooAnimal {
    void roar() {
        System.out.println("Lion roars loudly");
    }
}

class Elephant extends ZooAnimal {
    void sprayWater() {
        System.out.println("Elephant sprays water with trunk");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.feed();
        lion.roar();

        Elephant elephant = new Elephant();
        elephant.feed();
        elephant.sprayWater();
    }
}
