package com.xworkz.Objects.internal;

public class Airport {
    private String name;
    private char terminal;
    private int flights;

    public Airport(String name, char terminal, int flights) {
        this.name = name;
        this.terminal = terminal;
        this.flights = flights;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Airport) {
                System.out.println("Object is an instance of Airport");
                Airport other = (Airport) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Airport are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Airport [name=" + name + ", terminal=" + terminal + ", flights=" + flights + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 003;
    }
}
