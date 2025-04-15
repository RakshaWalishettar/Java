package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 'F', 1234);
        Employee e1=new Employee("Alice",'F',8653);
        System.out.println(e);

        System.out.println("the factory has:"+(e==e1));
        boolean same=e.equals(e1);
        System.out.println("both e1 and e are same :"+same);

        int code = e.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(e));
    }
}
