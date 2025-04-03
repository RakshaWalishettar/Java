package com.xworks.Inheritance.external;

public class Student2 extends Person{
    public void study() {
        System.out.println("Student is studying.");
    }
    {
        super.walk();
        System.out.println("Student is walking to school.");
    }
    {
        super.talk();
        System.out.println("Student is discussing lessons.");
    }
    {
        super.eat();
        System.out.println("Student is eating lunch at school.");
    }

    {
        super.sleep();
        System.out.println("Student is sleeping after studying.");
    }
    {
        super.breathe();
        System.out.println("Student is breathing deeply to focus.");
    }
}
