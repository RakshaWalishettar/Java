package com.xworkz.Objects.internal;

public class ElectricKettle {
    private String brand;
    private char material;
    private int capacity;

    public ElectricKettle(String brand, char material, int capacity) {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof ElectricKettle)
            {
                System.out.println("ref is beer, will compare...");
                ElectricKettle electricKettle1=this;
                ElectricKettle electricKettle2=(ElectricKettle) obj;//why should i do casting ??
                if(electricKettle1.brand.equals(electricKettle2.brand) && electricKettle1.material==electricKettle2.material )
                {
                    System.out.println("both material are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", material=" + material + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 34;
    }
}
