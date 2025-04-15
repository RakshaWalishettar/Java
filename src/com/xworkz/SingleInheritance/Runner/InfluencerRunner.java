package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.Influencer;

public class InfluencerRunner {
    public static void main(String[] args) {
        Influencer inf = new Influencer();
        inf.login();        // Inherited from User
        inf.postContent();  // Unique to Influencer
    }
}
