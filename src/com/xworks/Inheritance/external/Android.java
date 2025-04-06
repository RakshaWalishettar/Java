package com.xworks.Inheritance.external;

public class Android extends Robot{
    public Android() {
        System.out.println("Android is created...");
    }
    @Override
    public void walk(){
        System.out.println("Android walks like a human...");
    }
    @Override
    public void talk(){
        System.out.println("Android can talk naturally...");
    }
    @Override
    public void recognizeVoice(){
        System.out.println("Android uses AI to recognize voices...");
    }
    @Override
    public void performTask(){
        System.out.println("Android is performing complex tasks...");
    }
    @Override
    public void recharge(){
        System.out.println("Android is recharging wirelessly...");
    }
}
