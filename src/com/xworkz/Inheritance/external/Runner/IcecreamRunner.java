package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Cold;
import com.xworks.Inheritance.external.Icecream;

public class IcecreamRunner {
    public static void main(String[] args) {
        Icecream icecream = new Icecream();
        icecream.eat();
        icecream.flavorMix();
        icecream.melt();
        icecream.freeze();
        icecream.scoop();
        System.out.println("===========================");

        Cold cold= new Cold();
        cold.eat();
        cold.flavorMix();
        cold.melt();
        cold.freeze();
        cold.scoop();
    }
}
