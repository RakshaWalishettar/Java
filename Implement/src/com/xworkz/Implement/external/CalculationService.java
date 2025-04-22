package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Calculator;

public class CalculationService {
    private Calculator calculator;
    public CalculationService(Calculator calculator) {
        this.calculator = calculator;
        System.out.println("CalculationService initialized");
    }
    public void execute() {
        System.out.println("Running calculation...");
        if (this.calculator != null) {
            this.calculator.calculate();
        } else {
            System.out.println("not working");
        }
    }
}
