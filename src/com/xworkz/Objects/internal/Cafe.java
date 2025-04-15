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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Cafe) {
                System.out.println("Object is an instance of cafe");
                Cafe other = (Cafe) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Cafe are the same");
                    return true;
                }
            }
        }
        return false;
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
