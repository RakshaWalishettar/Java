package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.ColdStorage;
import com.xworkz.Connection.internal.Warehouse;

public class ColdStorageRunner {
    public static void main(String[] args) {
        Warehouse ws = new ColdStorage();
        ws.storeItem();
        ws.retrieveItem();
        ws.checkInventory();
    }

}
