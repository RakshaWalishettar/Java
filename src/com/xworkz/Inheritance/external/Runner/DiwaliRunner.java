package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Deepa;
import com.xworks.Inheritance.external.Diwali;
import com.xworks.Inheritance.external.Festival;

public class DiwaliRunner {
    public static void main(String[] args){
        Festival fest=new Festival();
        fest.visitRelatives();
        fest.lightLamps();
        fest.pray();
        fest.distributeSweets();
        fest.burstCrackers();

        System.out.println("============================");

        Diwali diwali=new Diwali();
        diwali.visitRelatives();
        diwali.lightLamps();
        diwali.distributeSweets();
        diwali.pray();
        diwali.burstCrackers();

        System.out.println("============================");
        Deepa deepa=new Deepa();
        deepa.dress(fest);
        deepa.dress(deepa);
    }
}
