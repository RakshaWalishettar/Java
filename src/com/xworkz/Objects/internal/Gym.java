package com.xworkz.Objects.internal;

public class Gym {
    private String gymName;
    private char membershipType;
    private int trainers;

    public Gym(String gymName, char membershipType, int trainers) {
        this.gymName = gymName;
        this.membershipType = membershipType;
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "Gym [gymName=" + gymName + ", membershipType=" + membershipType + ", trainers=" + trainers + "]";
    }
}
