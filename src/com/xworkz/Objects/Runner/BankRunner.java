package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank1 = new Bank("SafeBank", 'B', 2000);
        Bank bank2=new Bank("SafeBank",'F',865394);

        System.out.println("the bank has:"+(bank1==bank2));
        boolean same=bank1.equals(bank2);
        System.out.println("both bank1 and bank2 are same :"+same);


        int code = bank1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bank1));
    }
}
