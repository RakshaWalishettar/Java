package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.MessengerUser;
import com.xworkz.Implement.internal.Messenger;
import com.xworkz.Implement.internal.WhatsAppMessenger;

public class MessengerRunner {
    public static void main(String[] args) {
        Messenger messenger = new WhatsAppMessenger();
        MessengerUser user = new MessengerUser(messenger);
        user.execute();
    }
}
