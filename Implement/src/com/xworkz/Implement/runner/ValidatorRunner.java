package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ValidationService;
import com.xworkz.Implement.internal.EmailValidator;
import com.xworkz.Implement.internal.Validator;

public class ValidatorRunner {
    public static void main(String[] args) {
        Validator validator = new EmailValidator();
        ValidationService service = new ValidationService(validator);
        service.execute();
    }
}
