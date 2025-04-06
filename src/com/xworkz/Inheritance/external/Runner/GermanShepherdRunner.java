package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Dogs;
import com.xworks.Inheritance.external.GermanShepherd;

public class GermanShepherdRunner {
    public static void main(String[] args){
        Dogs dog =new Dogs();
        dog.sleeping();
        dog.eating();
        dog.breathing();
        dog.barking();
        dog.wagging();

        System.out.println("================================");

        GermanShepherd germanShepherd=new GermanShepherd();
        germanShepherd.sleeping();
        germanShepherd.barking();
        germanShepherd.breathing();
        germanShepherd.eating();
        germanShepherd.wagging();
    }
}
