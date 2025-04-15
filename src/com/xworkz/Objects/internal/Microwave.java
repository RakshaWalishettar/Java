package com.xworkz.Objects.internal;

public class Microwave {
    private String brand;
    private char feature;
    private int wattage;

    public Microwave(String brand, char feature, int wattage) {
        this.brand = brand;
        this.feature = feature;
        this.wattage = wattage;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Microwave)
            {
                System.out.println("ref is microwave, will compare...");
                Microwave microwave1=this;
                Microwave microwave2=(Microwave) obj;//why should i do casting ??
                if(microwave1.brand.equals(microwave2.brand) && microwave1.feature==microwave2.feature )
                {
                    System.out.println("both microwave are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Microwave [brand=" + brand + ", feature=" + feature + ", wattage=" + wattage + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -42;
    }
}
