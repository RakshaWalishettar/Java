package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.ZebraScanner;
import com.xworkz.Connection.internal.BarcodeScanner;

public class ZebraScannerRunner {
    public static void main(String[] args) {
        BarcodeScanner scanner = new ZebraScanner();
        scanner.scanCode();
        scanner.validateCode();
        scanner.clearScanner();
    }
}
