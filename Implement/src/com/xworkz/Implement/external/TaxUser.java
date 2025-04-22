package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.TaxCalculator;

public class TaxUser {
    private TaxCalculator taxCalculator;

    public TaxUser(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
        System.out.println("TaxUser is initialized.");
    }

    public void execute() {
        System.out.println("Starting tax calculation...");
        if (this.taxCalculator != null) {
            this.taxCalculator.calculator();
        } else {
            System.out.println("no tax");
        }
    }
}
