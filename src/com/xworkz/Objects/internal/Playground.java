package com.xworkz.Objects.internal;

public class Playground {
    private String name;
    private char section;
    private int games;

    public Playground(String name, char section, int games) {
        this.name = name;
        this.section = section;
        this.games = games;
    }

    @Override
    public String toString() {
        return "Playground [name=" + name + ", section=" + section + ", games=" + games + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -31;
    }
}
