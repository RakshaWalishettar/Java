package com.xworkz.country;

public class Details {
    String description;

    public Details(String description) {
        this.description = description;
    }

    public void display() {
        System.out.println("    Detail: " + this.description);
    }
}
