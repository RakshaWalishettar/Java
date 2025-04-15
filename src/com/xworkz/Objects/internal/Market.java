package com.xworkz.Objects.internal;

public class Market {
    private String name;
    private char marketType;
    private int vendors;

    public Market(String name, char marketType, int vendors) {
        this.name = name;
        this.marketType = marketType;
        this.vendors = vendors;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Market)
            {
                System.out.println("ref is Market, will compare...");
                Market market1=this;
                Market market2=(Market) obj;//why should i do casting ??
                if(market1.name.equals(market2.name) && market1.marketType==market2.marketType )
                {
                    System.out.println("both market are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Market [name=" + name + ", marketType=" + marketType + ", vendors=" + vendors + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -44;
    }
}
