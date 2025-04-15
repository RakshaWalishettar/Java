package com.xworkz.Objects.internal;

public class Tshirt {
    private String brand;
    private int size;
    private String colour;

    public Tshirt(String brand, int size, String colour) {
        System.out.println("Constructor with args of the Tshirt");
        this.brand = brand;
        this.size = size;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Tshirt) {
                System.out.println("Object is an instance of Tshirt");
                Tshirt other = (Tshirt) obj;
                if (this.brand.equals(other.brand) &&
                        this.size == other.size &&
                        this.colour.equals(other.colour)) {
                    System.out.println("Both T-shirts are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tshirt [brand=" + brand + ", size=" + size + ", colour=" + colour + "]";
    }
}
