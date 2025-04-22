package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Generator;
import com.xworkz.Implement.internal.Scheduler;

public class GeneratorUser {
    private Generator generator;
    public GeneratorUser(Generator generator) {
        this.generator = generator;
        System.out.println("GeneratorUser created");
    }
    public void execute() {
        System.out.println("Generating invoice...");
        if (this.generator != null) {
            this.generator.generator();
        }
        else {
            System.out.println("not genetrated");
        }
    }
}
