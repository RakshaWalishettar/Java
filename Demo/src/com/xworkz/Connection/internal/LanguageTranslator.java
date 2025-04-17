package com.xworkz.Connection.internal;

public interface LanguageTranslator {
    void inputText();
    void selectLanguage();
    void translateText();
    default void online() {
        System.out.println("Welcome!");
    }
}
