package com.xworkz.Objects.internal;

public class AmusementPark {
    private String name;
    private char zone;
    private int rides;

    public AmusementPark(String name, char zone, int rides) {
        this.name = name;
        this.zone = zone;
        this.rides = rides;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof AmusementPark) {
                System.out.println("Object is an instance of AP");
                AmusementPark other = (AmusementPark) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Park are the same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "AmusementPark [name=" + name + ", zone=" + zone + ", rides=" + rides + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 004;
    }
}
