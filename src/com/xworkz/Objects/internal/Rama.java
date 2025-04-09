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
}

