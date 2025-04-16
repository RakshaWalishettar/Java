package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.AndroidPhone;
import com.xworkz.Connection.internal.Smartphone;

public class AndriodRunner {
    public static void main(String[] args) {
        Smartphone phone = new AndroidPhone();
        phone.makeCall();
        phone.sendText();
        phone.useApp();
    }
}
