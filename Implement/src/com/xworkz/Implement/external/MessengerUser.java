package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Messenger;

public class MessengerUser {
    private Messenger messenger;
    public MessengerUser(Messenger messenger) {
        this.messenger = messenger;
        System.out.println("MessengerUser ready");
    }
    public void execute() {
        System.out.println("Sending message...");
        if(this.messenger!=null) {
            this.messenger.send();
        }
        }
}
