package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory f = new Factory("SteelMakers", 'S', 500);
        System.out.println(f);
    }
}
