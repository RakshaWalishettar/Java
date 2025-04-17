package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.SmartSpeaker;

public class Alexa implements SmartSpeaker {
    public void playMusic() {
        System.out.println("Alexa playing music.");
    }

    public void answerQuestion() {
        System.out.println("Alexa answering a question.");
    }

    public void controlDevices() {
        System.out.println("Alexa controlling smart devices.");
    }
    @Override
    public void greetUser() {
        System.out.println("Hello! This is Alexa. How can I help you today?");
    }
}
