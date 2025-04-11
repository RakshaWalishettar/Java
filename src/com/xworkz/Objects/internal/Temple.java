package com.xworkz.Objects.internal;

public class Temple {
    private String name;
    private char deity;
    private int visitors;

    public Temple(String name, char deity, int visitors) {
        this.name = name;
        this.deity = deity;
        this.visitors = visitors;
    }

    @Override
    public String toString() {
        return "Temple [name=" + name + ", deity=" + deity + ", visitors=" + visitors + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -23;
    }

}
