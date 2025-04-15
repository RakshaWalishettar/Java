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

    public char getClassType() {
        return classType;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setClassType(char classType) {
        this.classType = classType;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Airline) {
                System.out.println("Object is an instance of Airlines");
                Airline other = (Airline) obj;
                if (this.airlineName.equals(other.airlineName)) {
                    System.out.println("Both Airlines are the same");
                    return true;
                }
            }
        }
        return false;
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
