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
    public String toString() {
        return "Bank [name=" + name + ", branchCode=" + branchCode + ", accounts=" + accounts + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 11;
    }
}

