package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Browser;

public class Chrome implements Browser {
    public void openTab() {
        System.out.println("New tab opened in Chrome.");
    }
    public void browse() {
        System.out.println("Browsing webpage...");
    }
    public void closeTab() {
        System.out.println("Tab closed.");
    }


}
