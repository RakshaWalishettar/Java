package com.xworks.Inheritance.external;

public class Waterballon extends Colour{
    public void water(){
        System.out.println("the holi is played by water");
    }
    public void pichkari( Colour colour){
        colour.mixColours();
        colour.dry();
        colour.fade();
        colour.displayColour();
        colour.paint();

        if (colour instanceof Waterballon){
            Waterballon waterballon=new Waterballon();
            System.out.println("the instance of the waterballon is colour ");
            waterballon.water();
        }
    }
}
