package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.ChatGPT;
import com.xworkz.Connection.internal.AIModel;
public class ChatGPTRunner {
    public static void main(String[] args) {
        AIModel model = new ChatGPT();
        model.train();
        model.predict();
        model.evaluate();
        model.greatUser();
    }
}
