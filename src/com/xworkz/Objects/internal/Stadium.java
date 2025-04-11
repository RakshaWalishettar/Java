package com.xworkz.Objects.internal;

public class Stadium {
    private String stadiumName;
    private char sportType;
    private int capacity;

    public Stadium(String stadiumName, char sportType, int capacity) {
        this.stadiumName = stadiumName;
        this.sportType = sportType;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Stadium [stadiumName=" + stadiumName + ", sportType=" + sportType + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -28;
    }
}
