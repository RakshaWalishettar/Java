package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Chips;
import com.xworks.Inheritance.external.Flavour;
import com.xworks.Inheritance.external.Snacks;

public class ChipsRunner {
    public static void main(String[] args) {
        Snacks snacks = new Snacks();
        snacks.openPacket();
        snacks.flavor();
        snacks.crunch();
        snacks.share();
        snacks.finish();

        System.out.println("==============================");
        Chips chips=new Chips();
        chips.openPacket();
        chips.flavor();
        chips.crunch();
        chips.finish();
        chips.share();

        System.out.println("==============================");
        Flavour flavour=new Flavour();
        flavour.masala(snacks);
        flavour.masala(flavour);
    }
}
