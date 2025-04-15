package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.SavingsAccount;

public class SavingAccountRunner {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
        sa.calculateInterest();
    }
}
