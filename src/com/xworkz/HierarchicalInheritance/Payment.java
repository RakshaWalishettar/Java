package com.xworkz.HierarchicalInheritance;

public class Payment {
    void initiate() {
        System.out.println("Payment initiated");
    }
}

class CreditCard extends Payment {
    void swipeCard() {
        System.out.println("Swiping credit card");
    }
}

class UPI extends Payment {
    void scanQR() {
        System.out.println("Scanning QR code for UPI payment");
    }

    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.initiate();
        cc.swipeCard();

        UPI upi = new UPI();
        upi.initiate();
        upi.scanQR();
    }
}
