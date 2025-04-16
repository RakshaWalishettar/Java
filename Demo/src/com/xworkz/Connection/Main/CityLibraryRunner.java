package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.CityLibrary;
import com.xworkz.Connection.internal.Library;

public class CityLibraryRunner {
    public static void main(String[] args) {
        Library lib = new CityLibrary();
        lib.borrowBook();
        lib.searchCatalog();
        lib.returnBook();
    }
}
