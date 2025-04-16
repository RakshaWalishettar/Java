package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.LanguageTranslator;

public class GoogleTranslate implements LanguageTranslator {
    public void inputText() {
        System.out.println("Inputting text in Google Translate.");
    }

    public void selectLanguage() {
        System.out.println("Selecting language in Google Translate.");
    }

    public void translateText() {
        System.out.println("Translating text in Google Translate.");
    }
}
