package com.xworkz.Multilevelinheritance.internal;

public class Wildlife {
    void protectHabitat() {
        System.out.println("Wildlife conservation protects natural habitats");
    }
}

class Mammal extends Wildlife {
    void regulateTemperature() {
        System.out.println("Mammals regulate body temperature");
    }
}

class Tiger extends Mammal {
    void hunt() {
        System.out.println("Tiger hunts in the forest");
    }

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.protectHabitat();
        t.regulateTemperature();
        t.hunt();
    }
}
