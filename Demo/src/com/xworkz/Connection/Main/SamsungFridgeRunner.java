package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.SamsungFridge;
import com.xworkz.Connection.internal.SmartFridge;

public class SamsungFridgeRunner {
    public static void main(String[] args) {
        SmartFridge fridge = new SamsungFridge();
        fridge.checkInventory();
        fridge.coolItems();
        fridge.notifyExpiry();
        fridge.sendMessage();
    }
}
