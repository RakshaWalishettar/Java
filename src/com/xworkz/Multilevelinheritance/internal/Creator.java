package com.xworkz.Multilevelinheritance.internal;

public class Creator {
    void createContent() {
        System.out.println("Creating new content");
    }
}

class YouTuber extends Creator {
    void uploadVideo() {
        System.out.println("Uploading video on YouTube");
    }
}

class TechYouTuber extends YouTuber {
    void reviewGadget() {
        System.out.println("Reviewing a new gadget");
    }

    public static void main(String[] args) {
        TechYouTuber ty = new TechYouTuber();
        ty.createContent();
        ty.uploadVideo();
        ty.reviewGadget();
    }
}
