package com.xworkz.SingleInheritance.external;

import com.xworkz.SingleInheritance.internal.BankAccount;

public class SavingsAccount extends BankAccount {
    public void calculateInterest() {
        System.out.println("Calculating interest for savings account");
    }
}
