package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.BarcodeScanner;

public class ZebraScanner implements BarcodeScanner {
    public void scanCode() {
        System.out.println("Scanning barcode with Zebra Scanner.");
    }

    public void validateCode() {
        System.out.println("Validating barcode with Zebra Scanner.");
    }

    public void clearScanner() {
        System.out.println("Clearing Zebra Scanner.");
    }

}
