package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Translator;

public class TranslationService {
    private Translator translator;
    public TranslationService(Translator translator) {
        this.translator = translator;
        System.out.println("TranslationService initialized");
    }
    public void execute() {
        System.out.println("Executing translation...");
        if (this.translator != null) {
            this.translator.translate();
        }
    }
}
