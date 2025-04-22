package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.CleanService;
import com.xworkz.Implement.internal.Cleaner;
import com.xworkz.Implement.internal.DiskCleaner;

public class CleanerRunner {
    public static void main(String[] args) {
        Cleaner cleaner = new DiskCleaner();
        CleanService service = new CleanService(cleaner);
        service.execute();
    }
}
