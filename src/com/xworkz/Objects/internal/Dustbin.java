package com.xworkz.Objects.internal;

public class Dustbin {
    private String color;
    private char lidType;
    private int capacity;

    public Dustbin(String color, char lidType, int capacity) {
        this.color = color;
        this.lidType = lidType;
        this.capacity = capacity;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Dustbin)
            {
                System.out.println("ref is beer, will compare...");
                Dustbin dustbin1=this;
                Dustbin dustbin2=(Dustbin) obj;//why should i do casting ??
                if(dustbin1.color.equals(dustbin2.color) && dustbin1.lidType==dustbin2.lidType )
                {
                    System.out.println("both dustbin are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dustbin [color=" + color + ", lidType=" + lidType + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 33;
    }
}
