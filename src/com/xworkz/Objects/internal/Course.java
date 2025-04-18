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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Course) {
                System.out.println("Object is an instance of Course");
                Course other = (Course) obj;
                if (this.courseName.equals(other.courseName)) {
                    System.out.println("Both Course are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", level=" + level + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 29;
    }

}
