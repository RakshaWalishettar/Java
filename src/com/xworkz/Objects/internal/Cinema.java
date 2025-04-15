package com.xworkz.Objects.internal;

public class Cinema {
    private String name;
    private char screen;
    private int shows;

    public Cinema(String name, char screen, int shows) {
        this.name = name;
        this.screen = screen;
        this.shows = shows;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Cinema) {
                System.out.println("Object is an instance of cinema");
                Cinema other = (Cinema) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Cinema are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cinema [name=" + name + ", screen=" + screen + ", shows=" + shows + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 27;
    }
}
