package com.xworks.Inheritance.external;

public class Types extends MusicalInstrument{
    public void tune(){
        System.out.println("the guiter has the tune");
    }
    public void string(MusicalInstrument musicalInstrument){
        musicalInstrument.strum();
        musicalInstrument.pluck();
        musicalInstrument.tune();
        musicalInstrument.playChord();
        musicalInstrument.amplifySound();

        if(musicalInstrument instanceof Types){
            Types types=(Types) musicalInstrument;
            System.out.println("the instance of instrument is type");
            types.tune();
        }
    }
}
