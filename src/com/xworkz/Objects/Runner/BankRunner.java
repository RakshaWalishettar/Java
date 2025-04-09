package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank b = new Bank("SafeBank", 'B', 2000);
        System.out.println(b);
    }
}
