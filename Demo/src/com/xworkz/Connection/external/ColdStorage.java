package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Warehouse;

public class ColdStorage implements Warehouse {
    public void storeItem() {
        System.out.println("Item stored in cold storage.");
    }
    public void retrieveItem() {
        System.out.println("Item retrieved from cold storage.");
    }
    public void checkInventory() {
        System.out.println("Cold storage inventory checked.");
    }
}
