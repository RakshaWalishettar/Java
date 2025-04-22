package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Validator;

public class ValidationService {
    private Validator validator;
    public ValidationService(Validator validator) {
        this.validator = validator;
        System.out.println("ValidationService initialized");
    }
    public void execute() {
        System.out.println("Running validation...");
        if (this.validator != null) {
            this.validator.valiadte();
        } else {
            System.out.println("not running0");
        }
    }
}
