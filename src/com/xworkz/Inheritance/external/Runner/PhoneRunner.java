package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Gadget;
import com.xworks.Inheritance.external.Phone;

public class PhoneRunner {
    public static void main(String [] args){
        Gadget gadget=new Gadget();
        gadget.updateSoftware();
        gadget.turnOn();
        gadget.turnOff();
        gadget.connectToWiFi();
        gadget.charge();

        System.out.println("===================================");
        Phone phone=new Phone();
        phone.turnOn();
        phone.turnOff();
        phone.connectToWiFi();
        phone.updateSoftware();
        phone.charge();
    }
}

