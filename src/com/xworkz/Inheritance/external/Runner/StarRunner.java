package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Sky;
import com.xworks.Inheritance.external.Star;

public class StarRunner {
    public static void main(String[] args){
        Sky sky=new Sky();
        sky.generateHeat();
        sky.fuseHydrogen();
        sky.explodeSupernova();
        sky.emitLight();
        sky.collapse();

        System.out.println("========================");
        Star star=new Star();
        star.generateHeat();
        star.collapse();
        star.emitLight();
        star.explodeSupernova();
        star.fuseHydrogen();
    }
}
