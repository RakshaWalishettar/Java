package com.xworkz.Objects.internal;

public class ConventionCenter {
    private String name;
    private char hall;
    private int capacity;

    public ConventionCenter(String name, char hall, int capacity) {
        this.name = name;
        this.hall = hall;
        this.capacity = capacity;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof ConventionCenter) {
                System.out.println("Object is an instance of CC");
                ConventionCenter other = (ConventionCenter) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both CC are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ConventionCenter [name=" + name + ", hall=" + hall + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 28;
    }
}
