package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Instrument;
import com.xworks.Inheritance.external.Piano;

public class PianoRunner {
    public static void main (String[] args){
        Instrument instrument=new Instrument();
        instrument.sustainNote();
        instrument.playChord();
        instrument.pressKey();
        instrument.perform();

        System.out.println("=================================");
        Piano piano=new Piano();
        piano.sustainNote();
        piano.perform();
        piano.pressKey();
        piano.playChord();
    }
}
