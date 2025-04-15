package com.xworkz.Objects.internal;

public class Banana {
    private String type;
    private char level;
    private int price;

    public Banana(String type, char level, int price) {
        this.type = type;
        this.level = level;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Banana) {
                System.out.println("Object is an instance of Banana");
                Banana other = (Banana) obj;
                if (this.type.equals(other.type)) {
                    System.out.println("Both Banana are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Banana [type=" + type + ", level=" + level + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 10;
    }
}
