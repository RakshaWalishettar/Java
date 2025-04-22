package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.RenamerUser;
import com.xworkz.Implement.internal.FileRenamer;
import com.xworkz.Implement.internal.Renamer;

public class RenamerRunner {
    public static void main(String[] args) {
        Renamer renamer = new FileRenamer();
        RenamerUser user = new RenamerUser(renamer);
        user.execute();
    }
}
