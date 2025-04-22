package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Analyzer;
import com.xworkz.Implement.internal.Scheduler;

public class AnalysisService {
    private Analyzer analyzer;
    public AnalysisService(Analyzer analyzer) {
        this.analyzer = analyzer;
        System.out.println("AnalysisService initialized");
    }
    public void execute() {
        System.out.println("Starting analysis...");
        if (this.analyzer != null) {
            this.analyzer.analyze();
        } else {
            System.out.println("not analysis");
        }
    }
}
