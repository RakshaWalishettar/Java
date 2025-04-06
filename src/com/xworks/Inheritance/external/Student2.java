package com.xworks.Inheritance.external;

public class Student2 extends Person{
    public Student2() {
        System.out.println("Student is studying.");
    }
    @Override
    public void walk(){
        System.out.println("Student is walking to school.");
    }
    @Override
    public void talk(){
        System.out.println("Student is discussing lessons.");
    }
    @Override
    public void eat(){
        System.out.println("Student is eating lunch at school.");
    }

    @Override
    public void sleep(){
        System.out.println("Student is sleeping after studying.");
    }
    @Override
    public void breathe(){
        System.out.println("Student is breathing deeply to focus.");
    }
}
