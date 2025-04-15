package com.xworkz.HierarchicalInheritance;

public class BankAccount {
    void openAccount() {
        System.out.println("Account opened at the bank");
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        System.out.println("Interest added to savings account");
    }
}

class CurrentAccount extends BankAccount {
    void processCheque() {
        System.out.println("Cheque processed for current account");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.openAccount();
        sa.addInterest();

        CurrentAccount ca = new CurrentAccount();
        ca.openAccount();
        ca.processCheque();
    }

}
