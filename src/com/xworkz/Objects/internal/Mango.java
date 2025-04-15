package com.xworkz.Objects.internal;

public class Mango {
    private String color;
    private double weight;
    private int sweetnessLevel;

    public Mango(String color, double weight, int sweetnessLevel) {
        this.color = color;
        this.weight = weight;
        this.sweetnessLevel = sweetnessLevel;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Mango)
            {
                System.out.println("ref is Mango, will compare...");
                Mango mango1=this;
                Mango mango2=(Mango) obj;//why should i do casting ??
                if(mango1.color.equals(mango2.color) && mango1.weight==mango2.weight)
                {
                    System.out.println("both Mango are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mango [color=" + color + ", weight=" + weight + ", sweetnessLevel=" + sweetnessLevel + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -45;
    }

}
