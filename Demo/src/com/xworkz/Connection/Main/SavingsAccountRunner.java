package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.SavingsAccount;
import com.xworkz.Connection.internal.BankAccount;

public class SavingsAccountRunner {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount();
        acc.deposit();
        acc.withdraw();
        acc.checkBalance();
        acc.SavingsAccount();
    }
}
