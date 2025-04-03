package com.xworks.Inheritance.external;

public class Hardware extends Storage{
    public void hardDrive() {
        System.out.println("No-args constructor: HardDrive");
    }

    {
        super.storeData();
        System.out.println("HardDrive is storing data efficiently...");
    }

    {
        super.retrieveData();
        System.out.println("HardDrive is retrieving data...");
    }

    {
        super.format();
        System.out.println("HardDrive is formatting at high speed...");
    }

    {
        super.connect();
        System.out.println("HardDrive is connecting via SATA/USB...");
    }

    {
        super.disconnect();
        System.out.println("HardDrive is safely ejecting...");
    }
}
