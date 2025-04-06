package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Fruit;
import com.xworks.Inheritance.external.Juice;

public class JuiceRunner {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.serveCold();
        juice.extract();
        juice.drink();
        juice.blend();
        juice.addIce();

        System.out.println("============================");
        Fruit fruit = new Fruit();
        fruit.addIce();
        fruit.blend();
        fruit.drink();
        fruit.extract();
        fruit.serveCold();
    }
}
