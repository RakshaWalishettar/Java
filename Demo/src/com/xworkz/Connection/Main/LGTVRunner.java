package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.LGTV;
import com.xworkz.Connection.internal.SmartTV;

public class LGTVRunner {
    public static void main(String[] args) {
        SmartTV tv = new LGTV();
        tv.turnOn();
        tv.changeChannel();
        tv.turnOff();
        tv.user();
    }
}
