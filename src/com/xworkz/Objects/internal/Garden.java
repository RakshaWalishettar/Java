package com.xworkz.Objects.internal;

public class Garden {
    private String name;
    private char type;
    private int plants;

    public Garden(String name, char type, int plants) {
        this.name = name;
        this.type = type;
        this.plants = plants;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Garden)
            {
                System.out.println("ref is garden, will compare...");
                Garden garden1=this;
                Garden garden2=(Garden) obj;//why should i do casting ??
                if(garden1.name.equals(garden2.name) && garden1.type==garden2.type )
                {
                    System.out.println("both garden are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Garden [name=" + name + ", type=" + type + ", plants=" + plants + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 43;
    }
}
