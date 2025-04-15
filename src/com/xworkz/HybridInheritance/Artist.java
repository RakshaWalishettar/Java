package com.xworkz.HybridInheritance;

public interface Artist {
    void paint();
}

interface Musician {
    void playInstrument();
}

class CreativePerson implements Artist, Musician {
    public void paint() {
        System.out.println("Painting a beautiful landscape");
    }

    public void playInstrument() {
        System.out.println("Playing relaxing guitar music");
    }

    public static void main(String[] args) {
        CreativePerson cp = new CreativePerson();
        cp.paint();
        cp.playInstrument();
    }
}
