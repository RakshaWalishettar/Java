package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Ravi", 'S', 50000);
        BankAccount ba2=new BankAccount("Ravi",'R',86532);

        System.out.println("the Banana has:"+(ba1==ba2));
        boolean same=ba1.equals(ba2);
        System.out.println("both ba1 and ba2 are same :"+same);


        int code = ba1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ba1));
    }
}
