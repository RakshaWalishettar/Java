package com.xworkz.HybridInheritance;

public interface Rescuer {
    void rescue();
}

interface Communicator {
    void alert();
}

class Firefighter implements Rescuer, Communicator {
    public void rescue() {
        System.out.println("Firefighter rescues people from danger");
    }

    public void alert() {
        System.out.println("Firefighter alerts the control room");
    }

    public static void main(String[] args) {
        Firefighter f = new Firefighter();
        f.rescue();
        f.alert();
    }
}
