package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.external.CardiacSurgeon;
import com.xworkz.inheritance.external.Surgeon;

public class CSRunner {
    public static void main(String[] args){
        Surgeon surgeon=new Surgeon();
        Surgeon surgeons=new CardiacSurgeon();
    }
}
