package com.xworkz.Objects.internal;

public class Bag {
    private String color;
    private char size;
    private int price;

    public Bag(String color, char size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Bag) {
                System.out.println("Object is an instance of Bag");
                Bag other = (Bag) obj;
                if (this.color.equals(other.color)) {
                    System.out.println("Both Park are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bag [color=" + color + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 007;
    }

}
