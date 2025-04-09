package com.xworkz.Objects.internal;

public class Employee {
    private String name;
    private char gender;
    private int id;

    public Employee(String name, char gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + "]";
    }
}
