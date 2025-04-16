package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.SmartFridge;

public class SamsungFridge implements SmartFridge {
    public void checkInventory() {
        System.out.println("Checking inventory in Samsung Fridge.");
    }

    public void coolItems() {
        System.out.println("Cooling items in Samsung Fridge.");
    }

    public void notifyExpiry() {
        System.out.println("Notifying expiry items from Samsung Fridge.");
    }

}
