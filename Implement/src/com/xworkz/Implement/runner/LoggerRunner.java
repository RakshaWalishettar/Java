package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.LogManager;
import com.xworkz.Implement.internal.FileLogger;
import com.xworkz.Implement.internal.Logger;

public class LoggerRunner {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        LogManager manager = new LogManager(logger);
        manager.execute();
        logger.log();
    }
}
