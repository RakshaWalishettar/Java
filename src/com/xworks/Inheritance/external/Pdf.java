package com.xworks.Inheritance.external;

public class Pdf extends Document{
    public Pdf() {
        System.out.println("PDF document created.");
    }

    {
        super.open();
        System.out.println("PDF file is opening...");
    }

    {
        super.read();
        System.out.println("Reading PDF file...");
    }

    {
        super.write();
        System.out.println("Writing to PDF...");
    }

    {
        super.save();
        System.out.println("Saving PDF file...");
    }

    {
        super.close();
        System.out.println("Closing PDF file...");
    }
}
