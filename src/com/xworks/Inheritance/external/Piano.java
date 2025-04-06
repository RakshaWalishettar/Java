package com.xworks.Inheritance.external;

public class Piano extends Instrument{

    public void piano(){
        System.out.println("Piano: Pressing a piano key...");
    }
    @Override
    public void pressKey(){
        System.out.println("Piano: Sustaining a piano note...");
    }
    @Override
    public void sustainNote(){
        System.out.println("Piano: Playing a beautiful chord...");
    }
    @Override
    public void playChord(){
        System.out.println("Piano: Adjusting the piano's volume...");
    }
    @Override
    public void perform(){
        System.out.println("Piano: Performing a piano piece...");
    }
}
