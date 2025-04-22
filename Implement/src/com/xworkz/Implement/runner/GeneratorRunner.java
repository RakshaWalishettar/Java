package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.GeneratorUser;
import com.xworkz.Implement.internal.Generator;
import com.xworkz.Implement.internal.InvoiceGenerator;

public class GeneratorRunner {
    public static void main(String[] args) {
        Generator generator = new InvoiceGenerator();
        GeneratorUser user = new GeneratorUser(generator);
        user.execute();
    }
}
