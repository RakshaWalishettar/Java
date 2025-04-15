package com.xworkz.Objects.internal;

public class Mall {
    private String name;
    private char area;
    private int shops;

    public Mall(String name, char area, int shops) {
        this.name = name;
        this.area = area;
        this.shops = shops;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Mall)
            {
                System.out.println("ref is mall, will compare...");
                Mall mall1=this;
                Mall mall2=(Mall) obj;
                if(mall1.name.equals(mall2.name) && mall1.area==mall2.area )
                {
                    System.out.println("both mall are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mall [name=" + name + ", area=" + area + ", shops=" + shops + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -46;
    }
}
