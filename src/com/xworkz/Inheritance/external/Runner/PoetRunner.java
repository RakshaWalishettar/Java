package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Poet;

import com.xworks.Inheritance.external.Write;

public class PoetRunner {
    public static void main(String[] args) {
        Poet poet = new Poet();
        poet.research();
        poet.read();
        poet.publish();
        poet.edit();


        System.out.println("========================");
        Write writer = new Write();
        writer.research();
        writer.read();
        writer.edit();
        writer.publish();


    }
}
