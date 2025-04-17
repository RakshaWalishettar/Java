package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.GoogleTranslate;
import com.xworkz.Connection.internal.LanguageTranslator;

public class GoogleTranslateRunner {
    public static void main(String[] args) {
        LanguageTranslator translator = new GoogleTranslate();
        translator.inputText();
        translator.selectLanguage();
        translator.translateText();
        translator.online();
    }
}
