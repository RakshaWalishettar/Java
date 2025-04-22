package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Exporter;

public class ExportService {
    private Exporter exporter;
    public ExportService(Exporter exporter) {
        this.exporter = exporter;
        System.out.println("ExportService initialized");
    }
    public void execute() {
        System.out.println("Exporting data...");
        if (this.exporter != null) {
            this.exporter.exportDate();
        } else {
            System.out.println("not exporting");
        }
    }
}
