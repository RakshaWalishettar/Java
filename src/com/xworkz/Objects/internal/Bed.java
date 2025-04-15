package com.xworkz.Objects.internal;

public class Bed {
    private char size;
    private String name;
    private String material;

    public Bed(char size, String name, String material) {
        this.size = size;
        this.name = name;
        this.material = material;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Bed) {
                System.out.println("Object is an instance of Bed");
                Bed other = (Bed) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Bed are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bed [size=" + size + ", name=" + name + ", material=" + material + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 13;
    }

}
