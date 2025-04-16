package com.xworkz.Connection.Main.Connection.external;

import com.xworkz.Connection.internal.Library;

public class CityLibrary implements Library {
    public void borrowBook() {
        System.out.println("Book borrowed from library.");
    }
    public void returnBook() {
        System.out.println("Book returned.");
    }
    public void searchCatalog() {
        System.out.println("Searching catalog...");
    }
}
