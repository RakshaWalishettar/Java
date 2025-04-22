package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.CalculationService;
import com.xworkz.Implement.internal.BasicCalculator;
import com.xworkz.Implement.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        CalculationService service = new CalculationService(calculator);
        service.execute();
    }
}
