package com.xworks.Inheritance.external;

public class Summer extends Hot{
    public Summer() {
        System.out.println("Summer: No-args constructor.");
    }

    @Override
    public void temperatureRise(){
        System.out.println("Summer: Days get hotter.");
    }

    @Override
    public void sunBurn(){
        System.out.println("Summer: Skin burns easily.");
    }

    @Override
    public void dehydration(){
        System.out.println("Summer: Drink more water.");
    }

    @Override
    public void heatwaves(){
        System.out.println("Summer: Heatwaves affect daily life.");
    }

    @Override
    public void sweating(){
        System.out.println("Summer: Excessive sweating occurs.");
    }
}
