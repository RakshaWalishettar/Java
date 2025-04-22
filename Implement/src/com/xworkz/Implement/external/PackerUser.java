package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Packer;

public class PackerUser {
    private Packer packer;
    public PackerUser(Packer packer) {
        this.packer = packer;
        System.out.println("PackerUser set up");
    }
    public void execute() {
        System.out.println("Packing gift...");
        if (this.packer != null) {
            this.packer.pack();
        } else {
            System.out.println("not picking");
        }
    }
}
