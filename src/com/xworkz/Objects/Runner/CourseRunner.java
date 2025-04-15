package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Course;

public class CourseRunner {
    public static void main(String[] args) {
        Course course1 = new Course("Computer Science", 'B', 4);


        Course course2=new Course("Computer Science",'C',3);


        System.out.println("the AC has:"+(course1==course2));
        boolean same=course1.equals(course2);
        System.out.println("both course1 and course2 are same :"+same);


        int code = course1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(course1));
    }
}
