package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ReaderService;
import com.xworkz.Implement.internal.FileReader;
import com.xworkz.Implement.internal.Reader;

public class ReaderRunner {
    public static void main(String[] args) {
            Reader reader = new FileReader();
            ReaderService service = new ReaderService(reader);
            service.execute();
    }
}
