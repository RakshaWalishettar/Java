package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.FormattingService;
import com.xworkz.Implement.internal.Formatter;
import com.xworkz.Implement.internal.JsonFormatter;

public class FormatterRunner {
    public static void main(String[] args) {
        Formatter formatter = new JsonFormatter();
        FormattingService service = new FormattingService(formatter);
        service.execute();
    }
}
