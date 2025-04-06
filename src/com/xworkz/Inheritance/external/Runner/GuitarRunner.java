package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Guitar;
import com.xworks.Inheritance.external.MusicalInstrument;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.strum();
        guitar.pluck();
        guitar.playChord();
        guitar.tune();
        guitar.amplifySound();

        System.out.println("===================================");
        MusicalInstrument instrument = new MusicalInstrument();
        instrument.amplifySound();
        instrument.playChord();
        instrument.pluck();
        instrument.tune();
        instrument.strum();
    }
}
