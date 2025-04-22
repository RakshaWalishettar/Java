package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Renamer;

public class RenamerUser {
    private Renamer renamer;
    public RenamerUser(Renamer renamer) {
        this.renamer = renamer;
        System.out.println("RenamerUser created");
    }
    public void execute() {
        System.out.println("Renaming file...");
        if (this.renamer != null) {
            this.renamer.rename();
        } else {
            System.out.println("not renaming");
        }
    }
}
