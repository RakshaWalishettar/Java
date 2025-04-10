package com.xworkz.Objects.internal;

public class Bottle {
    private String type;
    private double capacity;
    private boolean isReusable;

    public Bottle(String type, double capacity, boolean isReusable) {
        this.type = type;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Bottle [type=" + type + ", capacity=" + capacity + "L, isReusable=" + isReusable + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 17;
    }
}
