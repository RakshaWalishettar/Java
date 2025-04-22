package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Logger;

public class LogManager {
    private Logger logger;

    public LogManager(Logger logger) {
        this.logger = logger;
        System.out.println("LogManager initialized");
    }

    public void execute() {
        System.out.println("Executing logging...");
        if (this.logger != null) {
            this.logger.log();
        }
    }
}
