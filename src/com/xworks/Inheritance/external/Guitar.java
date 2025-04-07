package com.xworks.Inheritance.external;

public class Guitar extends MusicalInstrument{
    public Guitar() {
        System.out.println("Guitar instance created");
    }
    @Override
    public void strum(){
        System.out.println("Guitar is strumming...");
    }
    @Override
    public void tune(){
        System.out.println("Guitar is tuning...");
    }
    @Override
    public void pluck(){
        System.out.println("Guitar is plucking...");
    }
    @Override
    public void playChord(){
        System.out.println("Guitar is playing chords...");
    }
    @Override
    public void amplifySound(){
        System.out.println("Guitar is amplifying sound...");
    }
    public void string(){
        System.out.println("the runner strings");
    }
}
