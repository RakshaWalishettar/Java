package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Dog;
import com.xworks.Inheritance.external.Mammals;

public class MammalsRunner {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.wagging();
        dog.eating();
        dog.breathing();
        dog.barking();
        dog.sleeping();
        System.out.println("==========================");

        Mammals mammals=new Mammals();
        mammals.wagging();
        mammals.eating();
        mammals.sleeping();
        mammals.breathing();
        mammals.barking();
    }
}
