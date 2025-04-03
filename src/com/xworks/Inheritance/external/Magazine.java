package com.xworks.Inheritance.external;

public class Magazine extends LibraryItem{
    {
        super.checkout();
        System.out.println("checkout from the magazine.");
    }

    public void returnItem() {
        System.out.println("returnItem the magazine.");
    }

    public void getInfo() {
        System.out.println("getInfo of the magazine.");
    }

    public void renew() {
        System.out.println("renew to the magazine.");
    }

    public void reserve() {
        System.out.println("reserve magazine subscription.");
    }
}
