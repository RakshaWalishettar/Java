package com.xworks.Inheritance.external;

public class Hardware extends Storage{
    public void hardDrive() {
        System.out.println("No-args constructor: HardDrive");
    }

    public void storeData(){
        System.out.println("HardDrive is storing data efficiently...");
    }

    public void retrieveData(){
        System.out.println("HardDrive is retrieving data...");
    }

    public void format(){
        System.out.println("HardDrive is formatting at high speed...");
    }

    public void connect(){
        System.out.println("HardDrive is connecting via SATA/USB...");
    }

    public void disconnect(){
        System.out.println("HardDrive is safely ejecting...");
    }
}
