package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Course;

public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course("Computer Science", 'B', 4);
        System.out.println(course);

        int code = course.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(course));
    }
}
