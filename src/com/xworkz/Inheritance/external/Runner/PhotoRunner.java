package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.PhotoEditor;
import com.xworks.Inheritance.external.SoftwareTool;

public class PhotoRunner
{
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();
        photoEditor.openImage();
        photoEditor.cropImage();
        photoEditor.adjustBrightness();
        photoEditor.applyFilter();
        photoEditor.saveImage();

        System.out.println("============================================");
        SoftwareTool tool= new SoftwareTool();
        tool.openImage();
        tool.cropImage();
        tool.applyFilter();
        tool.adjustBrightness();
        tool.saveImage();
    }

}
