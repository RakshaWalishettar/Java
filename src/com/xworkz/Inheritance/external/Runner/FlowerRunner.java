package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Flower;
import com.xworks.Inheritance.external.Plant;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.releaseOxygen();
        flower.photosynthesize();
        flower.absorbWater();
        flower.bloom();
        flower.grow();

        System.out.println("============================");
        Plant plant1 = new Plant();
        plant1.absorbWater();
        plant1.grow();
        plant1.bloom();
        plant1.releaseOxygen();
        plant1.photosynthesize();
    }
}
