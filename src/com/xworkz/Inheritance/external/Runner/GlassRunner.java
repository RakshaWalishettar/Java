package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.GlassWindow;
import com.xworks.Inheritance.external.Sensitive;
import com.xworks.Inheritance.external.Window;

public class GlassRunner {
    public static void main(String[] args) {
        GlassWindow glassWindow= new GlassWindow();
        glassWindow.resize();
        glassWindow.lock();
        glassWindow.close();
        glassWindow.clean();
        glassWindow.open();

        System.out.println("===============================");
        Window window1 = new Window();
        window1.resize();
        window1.open();
        window1.close();
        window1.clean();
        window1.lock();

        System.out.println("=============================");
        Sensitive sensitive=new Sensitive();
        sensitive.broke(window1);
        sensitive.broke(sensitive);
    }
}
