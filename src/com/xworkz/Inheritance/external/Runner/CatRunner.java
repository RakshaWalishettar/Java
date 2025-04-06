package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Cat;
import com.xworks.Inheritance.external.Felidae;

public class CatRunner {
    public static void main(String[] args){
        Felidae felidae=new Felidae();
        felidae.sleeping();
        felidae.hunting();
        felidae.roaring();
        felidae.breathing();
        felidae.eating();

        System.out.println("===================");

        Cat cat=new Cat();
        cat.hunting();
        cat.roaring();
        cat.breathing();
        cat.eating();
        cat.sleeping();
    }
}
