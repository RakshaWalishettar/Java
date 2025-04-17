package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.ATM;

public class BankOfAmericaATM implements ATM {
    public void insertCard() {
        System.out.println("Card inserted.");
    }

    public void withdrawCash() {
        System.out.println("Cash withdrawn.");
    }

    public void ejectCard() {
        System.out.println("Card ejected.");
    }
    @Override
    public void greetUser() {
        System.out.println("Welcome!");
    }
}
