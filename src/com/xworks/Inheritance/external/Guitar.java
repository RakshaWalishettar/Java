package com.xworks.Inheritance.external;

public class Guitar extends MusicalInstrument{
    public Guitar() {
        System.out.println("Guitar instance created");
    }

    {
        super.strum();
        System.out.println("Guitar is strumming...");
    }

    {
        super.tune();
        System.out.println("Guitar is tuning...");
    }

    {
        super.pluck();
        System.out.println("Guitar is plucking...");
    }

    {
        super.playChord();
        System.out.println("Guitar is playing chords...");
    }

    {
        super.amplifySound();
        System.out.println("Guitar is amplifying sound...");
    }
}
