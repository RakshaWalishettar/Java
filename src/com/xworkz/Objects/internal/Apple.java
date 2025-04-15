package com.xworkz.Objects.internal;

public class Apple {
    private String name;
    private char size;
    private int price;

    public Apple(String name,char size,int price){
        this.name=name;
        this.size=size;
        this.price=price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Apple) {
                System.out.println("Object is an instance of Apple");
                Apple other = (Apple) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Apple are the same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Apple [name=" + name + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 005;
    }
}
