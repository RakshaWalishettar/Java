package com.xworkz.HybridInheritance;

public interface Player {
    void train();
}

interface Swimmer {
    void swim();
}

class Triathlete implements Player, Swimmer {
    public void train() {
        System.out.println("Triathlete trains for endurance");
    }

    public void swim() {
        System.out.println("Triathlete swims as part of training");
    }

    public static void main(String[] args) {
        Triathlete t = new Triathlete();
        t.train();
        t.swim();
    }
}
