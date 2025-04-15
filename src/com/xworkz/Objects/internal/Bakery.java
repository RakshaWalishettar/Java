package com.xworkz.Objects.internal;

public class Bakery {
    private String name;
    private char specialty;
    private int items;

    public Bakery(String name, char specialty, int items) {
        this.name = name;
        this.specialty = specialty;
        this.items = items;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Bakery) {
                System.out.println("Object is an instance of Bakery");
                Bakery other = (Bakery) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Bakery are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bakery [name=" + name + ", specialty=" + specialty + ", items=" + items + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 8;
    }
}
