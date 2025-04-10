package com.xworkz.Objects.internal;

public class Student {
    private String name;
    private char grade;
    private int rollNo;

    public Student(String name, char grade, int rollNo) {
        this.name = name;
        this.grade = grade;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + ", rollNo=" + rollNo + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}
