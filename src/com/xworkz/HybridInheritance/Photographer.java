package com.xworkz.HybridInheritance;

public interface Photographer {
    void takePhoto();
}

interface Editor {
    void editPhoto();
}

class ContentCreator implements Photographer, Editor {
    public void takePhoto() {
        System.out.println("Content Creator takes high-quality photos");
    }

    public void editPhoto() {
        System.out.println("Content Creator edits photos using software");
    }

    public static void main(String[] args) {
        ContentCreator cc = new ContentCreator();
        cc.takePhoto();
        cc.editPhoto();
    }
}
