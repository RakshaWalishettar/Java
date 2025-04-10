package com.xworkz.Objects.internal;

public class Airline {
    private String airlineName;
    private char classType;
    private int passengers;

    public Airline(String airlineName, char classType, int passengers) {
        this.airlineName = airlineName;
        this.classType = classType;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Airline [airlineName=" + airlineName + ", classType=" + classType + ", passengers=" + passengers + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 002;
    }


}
