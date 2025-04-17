package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Chrome;
import com.xworkz.Connection.internal.Browser;

public class ChromeRunner {
    public static void main(String[] args) {
        Browser browser = new Chrome();
        browser.openTab();
        browser.browse();
        browser.closeTab();
        browser.information();
    }
}
