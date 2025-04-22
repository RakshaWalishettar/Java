package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ExportService;
import com.xworkz.Implement.internal.CsvExporter;
import com.xworkz.Implement.internal.Exporter;

public class ExportRunner {
    public static void main(String[] args) {
        Exporter exporter = new CsvExporter();
        ExportService service = new ExportService(exporter);
        service.execute();
    }
}
