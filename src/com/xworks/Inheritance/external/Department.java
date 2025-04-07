package com.xworks.Inheritance.external;

public class Department extends Student{
    public void sport(){
        System.out.println("the university has sports department");
    }
    public void university(Student student){
        student.takeExams();
        student.study();
        student.submitAssignments();
        student.graduate();
        student.attendClasses();

        if(student instanceof Department){
            Department department=(Department) student;
            System.out.println("the instance of students id departmnet");
            department.sport();
        }
    }
}
