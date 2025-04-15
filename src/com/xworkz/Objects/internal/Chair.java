package com.xworkz.Objects.internal;

public class Chair {
    private String type;
    private char level;
    private int price;

    public Chair(String type, char level, int price) {
        this.type = type;
        this.level = level;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Chair) {
                System.out.println("Object is an instance of Chair");
                Chair other = (Chair) obj;
                if (this.type.equals(other.type)) {
                    System.out.println("Both chair are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Chair [type=" + type + ", level=" + level + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 26;
    }
}
