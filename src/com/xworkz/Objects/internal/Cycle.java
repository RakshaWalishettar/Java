package com.xworkz.Objects.internal;

public class Cycle {
    private String brand;
    private char type;
    private int gear;

    public Cycle(String brand, char type, int gear) {
        this.brand = brand;
        this.type = type;
        this.gear = gear;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Cycle)
            {
                System.out.println("ref is beer, will compare...");
                Cycle cycle1=this;
                Cycle cycle2=(Cycle) obj;//why should i do casting ??
                if(cycle1.brand.equals(cycle2.brand) && cycle1.type==cycle2.type )
                {
                    System.out.println("both cycles are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cycle [brand=" + brand + ", type=" + type + ", gear=" + gear + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 31;
    }
}
