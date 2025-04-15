package com.xworkz.Objects.internal;

public class Farm {
    private String name;
    private char cropType;
    private int acres;

    public Farm(String name, char cropType, int acres) {
        this.name = name;
        this.cropType = cropType;
        this.acres = acres;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Farm)
            {
                System.out.println("ref is beer, will compare...");
                Farm farm1=this;
                Farm farm2=(Farm) obj;//why should i do casting ??
                if(farm1.name.equals(farm2.name) && farm1.cropType==farm2.cropType )
                {
                    System.out.println("both mirrors are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Farm [name=" + name + ", cropType=" + cropType + ", acres=" + acres + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 39;
    }
}
