package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Aves;
import com.xworks.Inheritance.external.Birds;
import com.xworks.Inheritance.external.Egg;


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

       System.out.println("=======================");
       Egg egg=new Egg();
       egg.sound(birds);
       egg.sound(egg);



    }
}
