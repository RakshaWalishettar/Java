package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.HDFCBank;
import com.xworkz.Connection.internal.OnlineBanking;

public class HDFCBankRunner {
    public static void main(String[] args) {
        OnlineBanking bank = new HDFCBank();
        bank.transferFunds();
        bank.checkBalance();
        bank.downloadStatement();
    }
}
