package com.xworkz.Objects.internal;

public class Cafe {
    private String name;
    private char theme;
    private int tables;

    public Cafe(String name, char theme, int tables) {
        this.name = name;
        this.theme = theme;
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Cafe [name=" + name + ", theme=" + theme + ", tables=" + tables + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 21;
    }
}
