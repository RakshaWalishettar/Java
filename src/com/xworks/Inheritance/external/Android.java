package com.xworks.Inheritance.external;

public class Android extends Robot{
    public Android() {
        System.out.println("Android is created...");
    }

    {
        super.walk();
        System.out.println("Android walks like a human...");
    }

    {
        super.talk();
        System.out.println("Android can talk naturally...");
    }

    {
        super.recognizeVoice();
        System.out.println("Android uses AI to recognize voices...");
    }

    {
        super.performTask();
        System.out.println("Android is performing complex tasks...");
    }

    {
        super.recharge();
        System.out.println("Android is recharging wirelessly...");
    }
}
