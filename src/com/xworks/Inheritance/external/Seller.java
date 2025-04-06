package com.xworks.Inheritance.external;

public class Seller extends User{
    public Seller(){
        System.out.println("no arg const");
    }@Override
    public void login() {
        System.out.println("Seller listed a product.");
    }
    @Override
    public void logout() {
        System.out.println("Seller set the price.");
    }
    @Override
    public void updateProfile() {
        System.out.println("Seller processed an order.");
    }
    @Override
    public void browseProducts() {
        System.out.println("Seller shipped the order.");
    }
    @Override
    public void contactSupport() {
        System.out.println("Seller received payment.");
    }
}
