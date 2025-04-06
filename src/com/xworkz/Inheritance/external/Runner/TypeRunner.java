package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Shoes;
import com.xworks.Inheritance.external.Type;

public class TypeRunner {
    public static void main(String[] args) {
        Type type = new Type();
        type.tieLaces();
        type.remove();
        type.polish();
        type.cleaning();
        type.wear();

        System.out.println("=======================================");
        Shoes shoes1 = new Shoes();
        shoes1.tieLaces();
        shoes1.remove();
        shoes1.polish();
        shoes1.cleaning();
        shoes1.wear();
    }
}
