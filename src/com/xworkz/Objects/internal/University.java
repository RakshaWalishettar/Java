package com.xworkz.Objects.internal;

public class University {
    private String name;
    private char accreditation;
    private int students;

    public University(String name, char accreditation, int students) {
        this.name = name;
        this.accreditation = accreditation;
        this.students = students;
    }

    @Override
    public String toString() {
        return "University [name=" + name + ", accreditation=" + accreditation + ", students=" + students + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -8;
    }
}
