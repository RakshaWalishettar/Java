package com.xworks.Inheritance.external;

public class Magazine extends LibraryItem{
    public Magazine(){
        System.out.println("no arg const ");
    }
    @Override
    public void checkout(){
        System.out.println("checkout from the magazine.");
    }
    @Override
    public void returnItem() {
        System.out.println("returnItem the magazine.");
    }
    @Override
    public void getInfo() {
        System.out.println("getInfo of the magazine.");
    }
    @Override
    public void renew() {
        System.out.println("renew to the magazine.");
    }
    @Override
    public void reserve() {
        System.out.println("reserve magazine subscription.");
    }
}
