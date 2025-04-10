package com.xworkz.Objects.internal;

public class School {
    private String name;
    private char board;
    private int students;

    public School(String name, char board, int students) {
        this.name = name;
        this.board = board;
        this.students = students;
    }

    @Override
    public String toString() {
        return "School [name=" + name + ", board=" + board + ", students=" + students + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }

}
