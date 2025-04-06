package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Sharp;
import com.xworks.Inheritance.external.Sword;

public class SharpRunner {
    public static void main(String[] args) {
        Sharp sharp= new Sharp();
        sharp.sharpen();
        sharp.swing();
        sharp.block();
        sharp.attack();
        sharp.stab();

        System.out.println("==============================");
        Sword sword = new Sword();
        sword.swing();
        sword.block();
        sword.sharpen();
        sword.swing();
        sword.attack();
    }
}
