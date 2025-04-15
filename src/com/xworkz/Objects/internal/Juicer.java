package com.xworkz.Objects.internal;

public class Juicer {
    private String brand;
    private char bladeType;
    private int speedLevels;

    public Juicer(String brand, char bladeType, int speedLevels) {
        this.brand = brand;
        this.bladeType = bladeType;
        this.speedLevels = speedLevels;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Juicer)
            {
                System.out.println("ref is juicer, will compare...");
                Juicer juicer1=this;
                Juicer juicer2=(Juicer) obj;//why should i do casting ??
                if(juicer1.brand.equals(juicer2.brand) && juicer1.bladeType==juicer2.bladeType )
                {
                    System.out.println("both juicer are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Juicer [brand=" + brand + ", bladeType=" + bladeType + ", speedLevels=" + speedLevels + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}
