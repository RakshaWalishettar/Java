package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.AIModel;

public class ChatGPT implements AIModel {
    public void train() {
        System.out.println("Model training started.");
    }
    public void predict() {
        System.out.println("Generating prediction...");
    }
    public void evaluate() {
        System.out.println("Evaluation complete.");
    }
    public void greatUser() {
        System.out.println("Welcome, User.");
    }

}
