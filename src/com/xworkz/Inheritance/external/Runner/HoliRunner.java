package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Colour;
import com.xworks.Inheritance.external.Holi;

public class HoliRunner {
    public static void main(String[] args){
        Colour colour=new Colour();
        colour.paint();
        colour.fade();
        colour.dry();
        colour.displayColour();
        colour.mixColours();

        System.out.println("========================");
        Holi holi=new Holi();
        holi.displayColour();
        holi.dry();
        holi.paint();
        holi.mixColours();
        holi.fade();
    }
}
