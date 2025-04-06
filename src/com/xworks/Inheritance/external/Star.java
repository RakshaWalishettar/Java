package com.xworks.Inheritance.external;

public class Star extends Sky{
    public void star() {
        System.out.println("No-args constructor Star");
    }

    @Override
    public void emitLight(){
        System.out.println("Star is emitting light...");
    }

    @Override
    public void generateHeat(){
        System.out.println("Star is generating heat...");
    }

    @Override
    public void fuseHydrogen(){
        System.out.println("Star is fusing hydrogen...");
    }

    @Override
    public void explodeSupernova(){
        System.out.println("Star is exploding into a supernova...");
    }

    @Override
    public void collapse(){
        System.out.println("Star is collapsing...");
    }
}
