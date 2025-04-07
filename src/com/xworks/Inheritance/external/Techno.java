package com.xworks.Inheritance.external;

public class Techno extends Assistant{
    public void trending() {
        System.out.println("the trending technology");
    }
    public void dancing(Assistant assistant){
        assistant.scheduleTask();
        assistant.learnPattern();
        assistant.scheduleTask();
        assistant.recognizeSpeech();
        assistant.answerQuery();


        if (assistant instanceof Techno){
            Techno tech=(Techno) assistant;
            System.out.println("new technology");
            tech.trending();
        }
    }
}
