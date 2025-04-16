package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Alexa;
import com.xworkz.Connection.internal.SmartSpeaker;

public class AlexaRunner {
    public static void main(String[] args) {
        SmartSpeaker speaker = new Alexa();
        speaker.playMusic();
        speaker.answerQuestion();
        speaker.controlDevices();
    }
}
