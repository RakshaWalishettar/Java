package com.xworks.Inheritance.external;

public class Stand extends Table{
    public Stand() {
        System.out.println("No-args constructor for Stand");
    }

    @Override
    public void expand(){
        System.out.println("Stand is expanding...");
    }

    @Override
    public void fold(){
        System.out.println("Stand is folding...");
    }

    @Override
    public void supportObjects(){
        System.out.println("Stand is supporting objects...");
    }

    @Override
    public void adjustHeight(){
        System.out.println("Stand height is being adjusted...");
    }

    @Override
    public void decorate(){
        System.out.println("Stand is being decorated...");
    }
}
