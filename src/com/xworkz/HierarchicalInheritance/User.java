package com.xworkz.HierarchicalInheritance;

public class User {
    void login() {
        System.out.println("User logs into the app");
    }
}

class Influencer extends User {
    void createPost() {
        System.out.println("Influencer creates a new post");
    }
}

class Follower extends User {
    void likePost() {
        System.out.println("Follower likes the post");
    }

    public static void main(String[] args) {
        Influencer inf = new Influencer();
        inf.login();
        inf.createPost();

        Follower fol = new Follower();
        fol.login();
        fol.likePost();
    }
}
