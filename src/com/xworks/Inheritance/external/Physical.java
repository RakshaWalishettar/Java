package com.xworks.Inheritance.external;

public class Physical extends Storage{
    public void pendrive(){
        System.out.println("the storage is pendrive");
    }
    public void device(Storage storage){
        storage.storeData();
        storage.format();
        storage.retrieveData();
        storage.connect();
        storage.disconnect();

        if(storage instanceof Physical){
            Physical physical=(Physical) storage;
            System.out.println("the instance of the physical is storage");
            physical.pendrive();
        }
    }
}
