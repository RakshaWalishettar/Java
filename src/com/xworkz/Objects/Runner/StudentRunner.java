package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student("John", 'A', 101);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}
