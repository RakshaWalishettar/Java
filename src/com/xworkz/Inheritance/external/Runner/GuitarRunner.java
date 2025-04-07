package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Guitar;
import com.xworks.Inheritance.external.MusicalInstrument;
import com.xworks.Inheritance.external.Types;

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

        System.out.println("=============================");
        Types types=new Types();
        types.string(instrument);
        types.string(types);
    }
}
