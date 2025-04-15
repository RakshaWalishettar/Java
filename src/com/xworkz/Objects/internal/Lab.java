package com.xworkz.Objects.internal;

public class Lab {
    private String name;
    private char category;
    private int equipment;

    public Lab(String name, char category, int equipment) {
        this.name = name;
        this.category = category;
        this.equipment = equipment;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Lab)
            {
                System.out.println("ref is lab, will compare...");
                Lab lab1=this;
                Lab lab2=(Lab) obj;//why should i do casting ??
                if(lab1.name.equals(lab2.name) && lab1.category==lab2.category )
                {
                    System.out.println("both lab are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lab [name=" + name + ", category=" + category + ", equipment=" + equipment + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -49;
    }
}
