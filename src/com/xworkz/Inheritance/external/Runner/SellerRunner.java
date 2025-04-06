package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Seller;
import com.xworks.Inheritance.external.User;

public class SellerRunner {
    public static void main(String[] args){
        Seller seller=new Seller();
        seller.login();
        seller.logout();
        seller.updateProfile();
        seller.contactSupport();
        seller.browseProducts();

        System.out.println("===================================");
        User user=new User();
        user.browseProducts();
        user.contactSupport();
        user.login();
        user.logout();
        user.updateProfile();
    }
}
