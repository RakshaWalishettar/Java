package com.xworks.Inheritance.external;

public class Piano extends Instrument{
    {
        super.pressKey() ;
        System.out.println("Piano: Pressing a piano key...");
    }

    {
        super.pressKey();
        System.out.println("Piano: Sustaining a piano note...");
    }

    {
        super.pressKey();
        System.out.println("Piano: Playing a beautiful chord...");
    }

    {
        super.pressKey();
        System.out.println("Piano: Adjusting the piano's volume...");
    }

    {
        super.pressKey();
        System.out.println("Piano: Performing a piano piece...");
    }
}
