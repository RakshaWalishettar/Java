package com.xworks.Inheritance.external;

public class OfficeSpace extends Property{
    public void officeSpace() {
        System.out.println("no-args constructor OfficeSpace");
    }
    @Override
    public void listForSale(){
        System.out.println("OfficeSpace is listed for sale...");
    }
    @Override
    public void rentOut(){
        System.out.println("OfficeSpace is being rented...");
    }
    @Override
    public void maintain(){
        System.out.println("OfficeSpace is under maintenance...");
    }
    @Override
    public void payTaxes(){
        System.out.println("OfficeSpace tax is being paid...");
    }
    @Override
    public void evaluateWorth(){
        System.out.println("OfficeSpace worth is evaluated...");
    }
}
