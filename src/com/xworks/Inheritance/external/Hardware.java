package com.xworks.Inheritance.external;

public class Hardware extends Storage{
    public void hardDrive() {
        System.out.println("No-args constructor: HardDrive");
    }
    @Override
    public void storeData(){
        System.out.println("HardDrive is storing data efficiently...");
    }
    @Override
    public void retrieveData(){
        System.out.println("HardDrive is retrieving data...");
    }
    @Override
    public void format(){
        System.out.println("HardDrive is formatting at high speed...");
    }
    @Override
    public void connect(){
        System.out.println("HardDrive is connecting via SATA/USB...");
    }
    @Override
    public void disconnect(){
        System.out.println("HardDrive is safely ejecting...");
    }
    public void device(){
        System.out.println("the device is runner");
    }

}
