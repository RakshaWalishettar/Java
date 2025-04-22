package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.PackerUser;
import com.xworkz.Implement.internal.GiftPacker;
import com.xworkz.Implement.internal.Packer;

public class PackerRunner {
    public static void main(String[] args) {
        Packer packer = new GiftPacker();
        PackerUser user = new PackerUser(packer);
        user.execute();
    }
}
