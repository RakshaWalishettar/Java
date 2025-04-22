package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Formatter;

public class FormattingService {
    private Formatter formatter;
    public FormattingService(Formatter formatter) {
        this.formatter = formatter;
        System.out.println("FormattingService initialized");
    }
    public void execute() {
        System.out.println("Formatting data...");
        if (this.formatter != null) {
            this.formatter.formate();
        } else {
            System.out.println("not formatting");
        }
    }
}
