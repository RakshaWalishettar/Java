package com.xworkz.Connection.Main;

import com.xworkz.Connection.internal.WashingMachine;
import com.xworkz.Connection.external.LGWasher;

public class LGRunner {
    public static void main(String[] args) {
        WashingMachine wm = new LGWasher();
        wm.startWash();
        wm.rinse();
        wm.spin();
        wm.user();
    }
}
