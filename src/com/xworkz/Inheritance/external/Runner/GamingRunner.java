package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Gamming;
import com.xworks.Inheritance.external.Laptop;

public class GamingRunner {
    public static void main(String[] args){
        Laptop laptop=new Laptop();
        laptop.specs();
        laptop.type();
        laptop.display();
        laptop.On();

        System.out.println("=====================================");
        Gamming gamming=new Gamming();
        gamming.display();
        gamming.specs();
        gamming.On();
        gamming.type();

    }
}
