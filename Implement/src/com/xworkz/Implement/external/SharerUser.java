package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Scanner;
import com.xworkz.Implement.internal.Sharer;

public class SharerUser {
    private Sharer sharer;
    public SharerUser(Sharer sharer) {
        this.sharer = sharer;
        System.out.println("SharerUser initialized");
    }
    public void execute() {
        System.out.println("Sharing content...");
        if (this.sharer != null) {
            this.sharer.share();
        } else {
            System.out.println("no sharing");
        }
    }
}
