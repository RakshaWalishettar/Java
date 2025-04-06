package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Person;
import com.xworks.Inheritance.external.Student2;

public class Student2Runner {
    public static void main(String[] args){
        Person person=new Person();
        person.walk();
        person.sleep();
        person.talk();
        person.breathe();
        person.eat();

        System.out.println("============================");
        Student2 student2=new Student2();
        student2.sleep();
        student2.walk();
        student2.breathe();
        student2.talk();
        student2.eat();
    }
}
