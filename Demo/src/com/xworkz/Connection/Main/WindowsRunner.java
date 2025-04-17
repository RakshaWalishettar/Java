package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.WindowsOS;
import com.xworkz.Connection.internal.OperatingSystem;

public class WindowsRunner {
    public static void main(String[] args) {
        OperatingSystem os = new WindowsOS();
        os.boot();
        os.runProcess();
        os.shutdown();
        os.subject();
    }
}
