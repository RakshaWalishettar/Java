package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.BankOfAmericaATM;
import com.xworkz.Connection.internal.ATM;

public class BankOfAmericaATMRunner {
    public static void main(String[] args) {
        ATM atm = new BankOfAmericaATM();
        atm.insertCard();
        atm.withdrawCash();
        atm.ejectCard();
        atm.greetUser();
    }
}
