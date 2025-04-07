package com.xworks.Inheritance.external;

public class Click extends Capture{
    public void photo() {
        System.out.println("takes photo");
    }
    public void lens(Capture cap){
        cap.zoomIn();
        cap.storeImages();
        cap.recordVideo();
        cap.storeImages();
        cap.adjustBrightness();
        cap.takePhoto();

        if(cap instanceof Click){
            Click click=(Click) cap;
            System.out.println("selfieee");
            click.photo();
        }
    }
}
