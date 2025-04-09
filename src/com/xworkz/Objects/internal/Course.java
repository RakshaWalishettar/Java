package com.xworkz.Objects.internal;

public class Course {
    private String courseName;
    private char level;
    private int duration;

    public Course(String courseName, char level, int duration) {
        this.courseName = courseName;
        this.level = level;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", level=" + level + ", duration=" + duration + "]";
    }

}
