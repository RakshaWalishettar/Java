package com.xworkz.Objects.internal;

public class Factory {
    private String name;
    private char productType;
    private int workers;

    public Factory(String name, char productType, int workers) {
        this.name = name;
        this.productType = productType;
        this.workers = workers;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Factory)
            {
                System.out.println("ref is beer, will compare...");
                Factory factory1=this;
                Factory factory2=(Factory) obj;//why should i do casting ??
                if(factory1.name.equals(factory2.name) && factory1.productType==factory2.productType )
                {
                    System.out.println("both faactory are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Factory [name=" + name + ", productType=" + productType + ", workers=" + workers + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 36;
    }
}
