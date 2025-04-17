package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.OnlineBanking;

public class HDFCBank implements OnlineBanking {
    public void transferFunds() {
        System.out.println("Transferring funds via HDFC Bank.");
    }

    public void checkBalance() {
        System.out.println("Checking balance at HDFC Bank.");
    }

    public void downloadStatement() {
        System.out.println("Downloading statement from HDFC Bank.");
    }
    @Override
    public void app() {
        System.out.println("Welcome!");
    }
}
