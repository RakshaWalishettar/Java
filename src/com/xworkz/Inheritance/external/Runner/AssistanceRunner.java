package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.AI;
import com.xworks.Inheritance.external.Assistant;
import com.xworks.Inheritance.external.Techno;

public class AssistanceRunner {
    public static void main(String[] args) {
        AI ai = new AI();
        ai.scheduleTask();
        ai.recognizeSpeech();
        ai.learnPattern();
        ai.answerQuery();
        ai.playMusic();

        System.out.println("=============================");

        Assistant assistant=new Assistant();
        assistant.recognizeSpeech();
        assistant.scheduleTask();
        assistant.learnPattern();
        assistant.playMusic();
        assistant.answerQuery();

        System.out.println("=================================");

        Techno techno=new Techno();
        techno.dancing(assistant);
        techno.dancing(techno);





    }
}
