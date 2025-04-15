package com.xworkz.Multilevelinheritance.internal;

public class Bank {
    void openAccount() {
        System.out.println("Bank account opened");
    }
}

class OnlineBanking extends Bank {
    void transferFunds() {
        System.out.println("Funds transferred using online banking");
    }
}

class MobileBanking extends OnlineBanking {
    void scanQR() {
        System.out.println("Scanning QR code for mobile payment");
    }

    public static void main(String[] args) {
        MobileBanking mb = new MobileBanking();
        mb.openAccount();
        mb.transferFunds();
        mb.scanQR();
    }
}
