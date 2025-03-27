package com.xworkz.country;

class Housekeep {
    String name;
    String duty;

    public Housekeep(String name, String duty) {
        this.name = name;
        this.duty = duty;
    }

    public void display() {
        System.out.println("        House Keeper: " + name + " | Duty: " + duty);
    }
}