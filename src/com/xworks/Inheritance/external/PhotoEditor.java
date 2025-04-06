package com.xworks.Inheritance.external;

public class PhotoEditor extends SoftwareTool{
    public PhotoEditor() {
        System.out.println("PhotoEditor: No-args constructor");
    }
    @Override
    public void openImage(){
        System.out.println("PhotoEditor: Opening an image with advanced tools...");
    }
    @Override
    public void applyFilter(){
        System.out.println("PhotoEditor: Applying high-quality filters...");
    }
    @Override
    public void cropImage(){
        System.out.println("PhotoEditor: Cropping image with precision...");
    }
    @Override
    public void adjustBrightness(){
        System.out.println("PhotoEditor: Fine-tuning brightness...");
    }
    @Override
    public void saveImage(){
        System.out.println("PhotoEditor: Saving edited image...");
    }
}
