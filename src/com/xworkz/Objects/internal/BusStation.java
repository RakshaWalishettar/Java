package com.xworkz.Objects.internal;

public class BusStation {
    private String name;
    private char platform;
    private int buses;

    public BusStation(String name, char platform, int buses) {
        this.name = name;
        this.platform = platform;
        this.buses = buses;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof BusStation) {
                System.out.println("Object is an instance of Busstation");
                BusStation other = (BusStation) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Bustation are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BusStation [name=" + name + ", platform=" + platform + ", buses=" + buses + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 20;
    }
}
