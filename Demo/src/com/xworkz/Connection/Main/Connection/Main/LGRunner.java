package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.LGWasher;
import com.xworkz.Connection.internal.WashingMachine;

public class LGRunner {
    public static void main(String[] args) {
        WashingMachine wm = new LGWasher();
        wm.startWash();
        wm.rinse();
        wm.spin();
    }
}
