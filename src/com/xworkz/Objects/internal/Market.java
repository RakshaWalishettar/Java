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
    public String toString() {
        return "Market [name=" + name + ", marketType=" + marketType + ", vendors=" + vendors + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}
