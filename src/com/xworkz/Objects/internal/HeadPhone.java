package com.xworkz.Objects.internal;

public class HeadPhone {
    private String brand;
    private char connectivity;
    private int batteryLife;

    public HeadPhone(String brand, char connectivity, int batteryLife) {
        this.brand = brand;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof HeadPhone)
            {
                System.out.println("ref is headphone, will compare...");
                HeadPhone headPhone1=this;
                HeadPhone headPhone2=(HeadPhone) obj;
                if(headPhone1.brand.equals(headPhone2.brand) && headPhone1.connectivity==headPhone2.connectivity )
                {
                    System.out.println("both headphone are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Headphones [brand=" + brand + ", connectivity=" + connectivity + ", batteryLife=" + batteryLife + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 46;
    }
}
