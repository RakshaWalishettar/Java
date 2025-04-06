package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Aves;
import com.xworks.Inheritance.external.Birds;


public class AvesRunner {
    public static void main (String[] args){
       Birds birds=new Birds();
       birds.migrate();
       birds.buildNest();
       birds.eat();
       birds.fly();
       birds.sing();

       System.out.println("==============");

       Aves aves=new Aves();
       aves.sing();
       aves.migrate();
       aves.fly();
       aves.eat();
       aves.buildNest();
    }
}
