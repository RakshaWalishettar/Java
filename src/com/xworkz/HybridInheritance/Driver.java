package com.xworkz.HybridInheritance;

public interface Driver {
    void drive();
}

interface Navigator {
    void navigate();
}

class TourGuide implements Driver, Navigator {
    public void drive() {
        System.out.println("Tour guide drives the vehicle");
    }

    public void navigate() {
        System.out.println("Tour guide navigates the route");
    }

    public static void main(String[] args) {
        TourGuide tg = new TourGuide();
        tg.drive();
        tg.navigate();
    }
}
