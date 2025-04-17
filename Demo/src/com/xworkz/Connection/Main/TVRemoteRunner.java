package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.TVRemote;
import com.xworkz.Connection.internal.RemoteControl;

public class TVRemoteRunner {
    public static void main(String[] args){
        RemoteControl remote = new TVRemote();
        remote.turnOn();
        remote.changeChannel();
        remote.turnOff();
        remote.buttons();
    }

}

