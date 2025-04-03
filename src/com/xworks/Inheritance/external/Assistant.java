package com.xworks.Inheritance.external;

public class Assistant extends AI{
    public Assistant() {
        System.out.println("Assistant initialized.");
    }

    {
        super.recognizeSpeech();
        System.out.println("Assistant is recognizing speech...");
    }

    {
        super.answerQuery();
        System.out.println("Assistant is answering a query...");
    }

    {
        super.playMusic();
        System.out.println("Assistant is playing music...");
    }

    {
        super.scheduleTask();
        System.out.println("Assistant is scheduling a task...");
    }

    {
        super.learnPattern();
        System.out.println("Assistant is learning patterns...");
    }
}
