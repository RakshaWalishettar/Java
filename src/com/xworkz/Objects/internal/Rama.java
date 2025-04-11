package com.xworkz.Objects.internal;

public class Rama {
    private int age;
    private String name;
    private String schoolname;

    public Rama(int age, String name, String schoolname) {
        this.age = age;
        this.name = name;
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return "Rama [age=" + age + ", name=" + name + ", schoolname=" + schoolname + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -20;
    }
}

