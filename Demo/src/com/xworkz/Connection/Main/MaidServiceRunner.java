package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.MaidService;
import com.xworkz.Connection.internal.CleaningService;

public class MaidServiceRunner {
    public static void main(String[] args) {
        CleaningService clean = new MaidService();
        clean.sweep();
        clean.mop();
        clean.dust();
    }
}
