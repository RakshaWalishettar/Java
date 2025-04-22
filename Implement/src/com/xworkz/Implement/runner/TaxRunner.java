package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.TaxUser;
import com.xworkz.Implement.internal.IncomeTaxCalculator;
import com.xworkz.Implement.internal.TaxCalculator;

public class TaxRunner {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new IncomeTaxCalculator();
        TaxUser user = new TaxUser(taxCalculator);
        user.execute();
    }
}
