package com.xworkz.Connection.internal;

public interface BarcodeScanner {
    void scanCode();
    void validateCode();
    void clearScanner();
}
