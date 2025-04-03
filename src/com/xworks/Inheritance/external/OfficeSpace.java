package com.xworks.Inheritance.external;

public class OfficeSpace extends Property{
    public void officeSpace() {
        System.out.println("no-args constructor OfficeSpace");
    }

    {
        super.listForSale();
        System.out.println("OfficeSpace is listed for sale...");
    }

    {
        super.rentOut();
        System.out.println("OfficeSpace is being rented...");
    }

    {
        super.maintain();
        System.out.println("OfficeSpace is under maintenance...");
    }

    {
        super.payTaxes();
        System.out.println("OfficeSpace tax is being paid...");
    }

    {
        super.evaluateWorth();
        System.out.println("OfficeSpace worth is evaluated...");
    }
}
