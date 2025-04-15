package com.xworkz.Objects.internal;

public class Hostel {
    private String name;
    private char type;
    private int capacity;

    public Hostel(String name, char type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Hostel)
            {
                System.out.println("ref is hostel, will compare...");
                Hostel hostel1=this;
                Hostel hostel2=(Hostel) obj;//why should i do casting ??
                if(hostel1.name.equals(hostel2.name) && hostel1.type==hostel2.type )
                {
                    System.out.println("both hostel are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hostel [name=" + name + ", type=" + type + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 48;
    }
}
