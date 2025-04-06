package com.xworks.Inheritance.external;

public class Instagram extends SocialMedia{
public Instagram() {
    System.out.println("no args const");}
    public void createAccount(){
        System.out.println("createaccount on instagram");
    }@Override
    public void login(){
        System.out.println("login on instagram");
    }@Override
    public void logout(){
        System.out.println("logout on instagram");
    }@Override
    public void browseContent(){
        System.out.println("browseContent on instagram");
    }@Override
    public void deleteAccount(){
        System.out.println("deleteAccount on instagram");
    }
}
