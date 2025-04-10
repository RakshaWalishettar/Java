package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 'F', 1234);
        System.out.println(e);

        int code = e.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(e));
    }
}
