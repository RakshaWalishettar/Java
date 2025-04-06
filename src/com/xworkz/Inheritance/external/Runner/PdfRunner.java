package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Document;
import com.xworks.Inheritance.external.Pdf;

public class PdfRunner {
    public static void main(String[] args) {
        Pdf pdf = new Pdf();
        pdf.write();
        pdf.read();
        pdf.open();
        pdf.close();
        pdf.save();

        System.out.println("=================================");
        Document doc = new Document();
        doc.write();
        doc.read();
        doc.open();
        doc.save();
        doc.close();
    }
}
