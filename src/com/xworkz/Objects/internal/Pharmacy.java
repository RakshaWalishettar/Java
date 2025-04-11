package com.xworkz.Objects.internal;

public class Pharmacy {
    private String name;
    private char license;
    private int medicines;

    public Pharmacy(String name, char license, int medicines) {
        this.name = name;
        this.license = license;
        this.medicines = medicines;
    }

    @Override
    public String toString() {
        return "Pharmacy [name=" + name + ", license=" + license + ", medicines=" + medicines + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -33;
    }
}
