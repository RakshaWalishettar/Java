package com.xworkz.HierarchicalInheritance;

public class Transport {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends Transport {
    void pickPassengers() {
        System.out.println("Bus picks up passengers");
    }
}

class Train extends Transport {
    void departStation() {
        System.out.println("Train departs from station");
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.pickPassengers();

        Train train = new Train();
        train.move();
        train.departStation();
    }
}
