package com.xworkz.Objects.internal;

public class Glass {
    private String shape;
    private char thickness;
    private int price;

    public Glass(String shape, char thickness, int price) {
        this.shape = shape;
        this.thickness = thickness;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Glass)
            {
                System.out.println("ref is glass, will compare...");
                Glass glass1=this;
                Glass glass2=(Glass) obj;//why should i do casting ??
                if(glass1.shape.equals(glass2.shape) && glass1.thickness==glass2.thickness )
                {
                    System.out.println("both glass are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Glass [shape=" + shape + ", thickness=" + thickness + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 44;
    }
}
