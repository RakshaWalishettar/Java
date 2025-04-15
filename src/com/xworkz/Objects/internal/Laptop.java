package com.xworkz.Objects.internal;

public class Laptop {
    private String brand;
    private char grade;
    private int cost;

    public Laptop(String brand, char grade, int cost) {
        this.brand = brand;
        this.grade = grade;
        this.cost = cost;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Mirror)
            {
                System.out.println("ref is laptop, will compare...");
                Laptop laptop1=this;
                Laptop laptop2=(Laptop) obj;//why should i do casting ??
                if(laptop1.brand.equals(laptop2.brand) && laptop1.grade==laptop2.grade )
                {
                    System.out.println("both laptop are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", grade=" + grade + ", cost=" + cost + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -48;
    }
}
