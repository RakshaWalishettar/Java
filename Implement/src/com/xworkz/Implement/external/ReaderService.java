package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Reader;

public class ReaderService {
    private Reader reader;

    public ReaderService(Reader reader) {
        this.reader = reader;
        System.out.println("ReaderService initialized");
    }

    public void execute() {
        System.out.println("Executing read operation...");
        if (this.reader != null) {
            this.reader.read();
        } else {
            System.out.println("not a reader");
        }
    }
}
