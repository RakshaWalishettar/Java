package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Synchronizer;

public class SynchronizerUser {
    private Synchronizer synchronizer;
    public SynchronizerUser(Synchronizer synchronizer) {
        this.synchronizer = synchronizer;
        System.out.println("SynchronizerUser initialized");
    }
    public void execute() {
        System.out.println("Syncing files...");
        if (this.synchronizer != null) {
            this.synchronizer.sync();
        } else {
            System.out.println("no sync files");
        }
    }
}
