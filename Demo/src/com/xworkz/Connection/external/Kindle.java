package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.EBookReader;

public class Kindle implements EBookReader {
    public void openBook() {
        System.out.println("Opening eBook on Kindle.");
    }

    public void nextPage() {
        System.out.println("Turning page on Kindle.");
    }

    public void closeBook() {
        System.out.println("Closing eBook on Kindle.");
    }
}
