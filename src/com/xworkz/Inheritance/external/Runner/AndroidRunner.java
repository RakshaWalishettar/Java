package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Android;
import com.xworks.Inheritance.external.Robot;

public class AndroidRunner {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.walk();
        robot1.talk();
        robot1.recognizeVoice();
        robot1.performTask();
        robot1.recharge();

        System.out.println("=================");

        Android android=new Android();
        android.walk();
        android.talk();
        android.recognizeVoice();
        android.performTask();
        android.recharge();
    }
}
