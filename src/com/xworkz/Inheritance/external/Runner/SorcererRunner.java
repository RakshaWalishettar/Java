package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Mage;
import com.xworks.Inheritance.external.Sorcerer;

public class SorcererRunner {
    public static void main(String[] args){
        Mage mage=new Mage();
        mage.sleeping();
        mage.eating();
        mage.breathing();
        mage.castingSpells();
        mage.channelingMana();

        System.out.println("==============================");
        Sorcerer sorcerer=new Sorcerer();
        sorcerer.sleeping();
        sorcerer.eating();
        sorcerer.breathing();
        sorcerer.castingSpells();
        sorcerer.channelingMana();
    }
}
