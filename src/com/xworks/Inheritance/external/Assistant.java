package com.xworks.Inheritance.external;

public class Assistant extends AI{
    public Assistant() {
        System.out.println("Assistant initialized.");
    }
    @Override
    public void recognizeSpeech(){
        System.out.println("Assistant is recognizing speech...");
    }
    @Override
    public void answerQuery(){
        System.out.println("Assistant is answering a query...");
    }
    @Override
    public void playMusic(){
        System.out.println("Assistant is playing music...");
    }
    @Override
    public void scheduleTask(){
        System.out.println("Assistant is scheduling a task...");
    }
    @Override
    public void learnPattern(){
        System.out.println("Assistant is learning patterns...");
    }
    public void dancing(){
        System.out.println("Assistant is dancing");
    }
}
