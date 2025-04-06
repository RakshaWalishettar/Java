package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Bird;

import com.xworks.Inheritance.external.Parrot;

public class ParrotRunner {
    public static void main(String[] args){
        Bird bird=new Bird();
        bird.sleeping();
        bird.eating();
        bird.chirping();
        bird.flying();
        bird.breathing();

        System.out.println("==============================");
        Parrot parrot=new Parrot();
        parrot.breathing();
        parrot.chirping();
        parrot.eating();
        parrot.flying();
        parrot.sleeping();

    }
}
