package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.AnalysisService;
import com.xworkz.Implement.internal.Analyzer;
import com.xworkz.Implement.internal.TextAnalyzer;

public class AnalyzerRunner {
    public static void main(String[] args) {
        Analyzer analyzer = new TextAnalyzer();
        AnalysisService service = new AnalysisService(analyzer);
        service.execute();
    }
}
