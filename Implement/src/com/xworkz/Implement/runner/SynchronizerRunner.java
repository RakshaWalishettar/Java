package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.SynchronizerUser;
import com.xworkz.Implement.internal.FileSynchronizer;
import com.xworkz.Implement.internal.Synchronizer;

public class SynchronizerRunner {
    public static void main(String[] args) {
        Synchronizer synchronizer = new FileSynchronizer();
        SynchronizerUser user = new SynchronizerUser(synchronizer);
        user.execute();
    }
}
