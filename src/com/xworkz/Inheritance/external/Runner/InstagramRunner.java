package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Instagram;
import com.xworks.Inheritance.external.SocialMedia;

public class InstagramRunner {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.logout();
        socialMedia.login();
        socialMedia.deleteAccount();
        socialMedia.browseContent();
        socialMedia.createAccount();

        System.out.println("================================");
        Instagram instagram= new Instagram();
        instagram.deleteAccount();
        instagram.createAccount();
        instagram.logout();
        instagram.browseContent();
        instagram.login();
    }
}

