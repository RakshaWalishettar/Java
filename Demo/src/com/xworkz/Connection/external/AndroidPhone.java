package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Smartphone;

public class AndroidPhone implements Smartphone {
    public void makeCall() {
        System.out.println("Calling from Android phone...");
    }
    public void sendText() {
        System.out.println("Text message sent.");
    }
    public void useApp() {
        System.out.println("Opening app on Android.");
    }
    @Override
    public void greetUser() {
        System.out.println("Welcome! I am your smart speaker.");
    }
}
