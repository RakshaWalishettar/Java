package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.SharerUser;
import com.xworkz.Implement.internal.LinkSharer;
import com.xworkz.Implement.internal.Sharer;

public class SharerRunner {
    public static void main(String[] args) {
        Sharer sharer = new LinkSharer();
        SharerUser user = new SharerUser(sharer);
        user.execute();
    }
}
