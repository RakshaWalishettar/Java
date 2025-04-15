package com.xworkz.Objects.internal;

public class Bank {
    private String name;
    private char branchCode;
    private int accounts;

    public Bank(String name, char branchCode, int accounts) {
        this.name = name;
        this.branchCode = branchCode;
        this.accounts = accounts;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Bank) {
                System.out.println("Object is an instance of Bank");
                Bank other = (Bank) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Bank are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank [name=" + name + ", branchCode=" + branchCode + ", accounts=" + accounts + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 11;
    }
}

