package com.xworks.Inheritance.external;

public class Instagram extends SocialMedia{
public void instagram() {
    System.out.println("no args const");
    {
        super.createAccount();
        System.out.println("createaccount on instagram");
    }
    {
        super.login();
        System.out.println("login on instagram");
    }
    {
        super.logout();
        System.out.println("logout on instagram");
    }
    {
        super.browseContent();
        System.out.println("browseContent on instagram");
    }
    {
        super.deleteAccount();
        System.out.println("deleteAccount on instagram");
    }

    }
}
