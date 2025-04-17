package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.RemoteControl;

public class TVRemote implements RemoteControl {
    public void turnOn() {
        System.out.println("TV turned on.");
    }
    public void changeChannel() {
        System.out.println("Channel changed.");
    }
    public void turnOff() {
        System.out.println("TV turned off.");
    }
    @Override
    public void buttons() {
        System.out.println("Welcome!");
    }

}
