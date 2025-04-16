package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.BluetoothHeadphones;
import com.xworkz.Connection.internal.Headphones;

public class BluetoothHeadphoneRunner {
    public static void main(String[] args) {
        Headphones hp = new BluetoothHeadphones();
        hp.connectBluetooth();
        hp.playAudio();
        hp.disconnect();
    }
}
