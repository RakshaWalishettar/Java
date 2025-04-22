package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.TranslationService;
import com.xworkz.Implement.internal.EnglishToSpanishTranslator;
import com.xworkz.Implement.internal.Translator;

public class TranslatorRunner {
    public static void main(String[] args) {
        Translator translator = new EnglishToSpanishTranslator();
        TranslationService service = new TranslationService(translator);
        service.execute();
    }
}
