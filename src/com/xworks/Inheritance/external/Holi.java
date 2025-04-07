package com.xworks.Inheritance.external;

public class Holi extends Colour{
    public Holi(){
        System.out.println("no arg const of holi");
    }@Override
    public void displayColour() {
        System.out.println("Throwing colours for Holi!");
    }
    @Override
    public void mixColours() {
        System.out.println("Splashing water during Holi!");
    }
    @Override
    public void paint() {
        System.out.println("Dancing and celebrating Holi!");
    }
    @Override
    public void dry() {
        System.out.println("Preparing sweets for Holi!");
    }
    @Override
    public void fade() {
        System.out.println("Playing Holi with friends!");
    }
    public void pichkari(){
        System.out.println("runner pichkari");
    }
}
