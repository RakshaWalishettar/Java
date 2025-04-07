package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Gamming;
import com.xworks.Inheritance.external.Laptop;
import com.xworks.Inheritance.external.Playstation;

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

        System.out.println("======================================");
        Playstation playstation=new Playstation();
        playstation.device(laptop);
        playstation.device(playstation);
    }
}
