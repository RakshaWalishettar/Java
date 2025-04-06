package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.OfficeSpace;
import com.xworks.Inheritance.external.Property;

public class officeRunner {
    public static void main(String[] args){
        OfficeSpace officeRunner= new OfficeSpace();
        officeRunner.payTaxes();
        officeRunner.rentOut();
        officeRunner.listForSale();
        officeRunner.evaluateWorth();
        officeRunner.maintain();

        System.out.println("=====================================");
        Property property = new Property();
        property.payTaxes();
        property.maintain();
        property.listForSale();
        property.rentOut();
        property.evaluateWorth();
    }
}
