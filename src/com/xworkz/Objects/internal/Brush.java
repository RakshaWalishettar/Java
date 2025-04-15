package com.xworkz.Objects.internal;

public class Brush {
    private String type;
    private char quality;
    private int price;

    public Brush(String type, char quality, int price) {
        this.type = type;
        this.quality = quality;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Brush) {
                System.out.println("Object is an instance of brush");
                Brush other = (Brush) obj;
                if (this.type.equals(other.type)) {
                    System.out.println("Both brush are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brush [type=" + type + ", quality=" + quality + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 19;
    }
}
