package com.xworks.Inheritance.external;

public class PhotoEditor extends SoftwareTool{
    public PhotoEditor() {
        System.out.println("PhotoEditor: No-args constructor");
    }

    {
        super.openImage();
        System.out.println("PhotoEditor: Opening an image with advanced tools...");
    }

    {
        super.applyFilter();
        System.out.println("PhotoEditor: Applying high-quality filters...");
    }

    {
        super.cropImage();
        System.out.println("PhotoEditor: Cropping image with precision...");
    }

    {
        super.adjustBrightness();
        System.out.println("PhotoEditor: Fine-tuning brightness...");
    }

    {
        super.saveImage();
        System.out.println("PhotoEditor: Saving edited image...");
    }
}
