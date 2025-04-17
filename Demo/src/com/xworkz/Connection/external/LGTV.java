package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.SmartTV;

public class LGTV implements SmartTV {
    public void turnOn() {
        System.out.println("LG TV turned on.");
    }

    public void changeChannel() {
        System.out.println("LG TV channel changed.");
    }

    public void turnOff() {
        System.out.println("LG TV turned off.");
    }
    @Override
    public void user() {
        System.out.println("Welcome!");
    }
}
