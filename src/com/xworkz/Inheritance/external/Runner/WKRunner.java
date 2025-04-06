package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Knight;
import com.xworks.Inheritance.external.Warrior;

public class WKRunner {
    public static void main(String[] args){
        Warrior warrior=new Warrior();
        warrior.training();
        warrior.strategizing();
        warrior.fighting();
        warrior.defending();
        warrior.riding();


        System.out.println("==============================");
        Knight knight=new Knight();
        knight.training();
        knight.strategizing();
        knight.fighting();
        knight.defending();
        knight.riding();
    }
}
