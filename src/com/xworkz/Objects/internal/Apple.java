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
    public String toString() {
        return "Apple [name=" + name + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 005;
    }
}
