package com.xworks.Inheritance.external;

public class GlassWindow extends Window {
    public void glassWindow() {
        System.out.println("GlassWindow constructor invoked");
    }

    {
        super.open();
        System.out.println("GlassWindow is opened smoothly");
    }

    {
        super.close();
        System.out.println("GlassWindow is closed securely");
    }

    {
        super.lock();
        System.out.println("GlassWindow is locked with a modern mechanism");
    }

    {
        super.clean();
        System.out.println("GlassWindow is cleaned with special glass cleaner");
    }

    {
        super.resize();
        System.out.println("GlassWindow size adjusted precisely");
    }
}
