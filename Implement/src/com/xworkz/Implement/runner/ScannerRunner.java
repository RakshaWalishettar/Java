package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ScannerUser;
import com.xworkz.Implement.internal.Scanner;
import com.xworkz.Implement.internal.VirusScanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new VirusScanner();
        ScannerUser user = new ScannerUser(scanner);
        user.execute();
    }
}
