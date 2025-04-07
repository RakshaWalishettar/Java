package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Department;
import com.xworks.Inheritance.external.Graduate;
import com.xworks.Inheritance.external.Student;

public class GraduateRunner {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.submitAssignments();
        graduate.takeExams();
        graduate.attendClasses();
        graduate.graduate();
        graduate.study();

        System.out.println("================================================");
        Student student1 = new Student();
        student1.attendClasses();
        student1.graduate();
        student1.study();
        student1.submitAssignments();
        student1.takeExams();

        System.out.println("=============================");
        Department department=new Department();
        department.university(student1);
        department.university(department);
    }
}
