package com.xworks.Inheritance.external;

public class GlassWindow extends Window {
    public GlassWindow() {
        System.out.println("GlassWindow constructor invoked");
    }
    @Override
    public void open(){
        System.out.println("GlassWindow is opened smoothly");
    }
    @Override
    public void close(){
        System.out.println("GlassWindow is closed securely");
    }
    @Override
    public void lock(){
        System.out.println("GlassWindow is locked with a modern mechanism");
    }
    @Override
    public void clean(){
        System.out.println("GlassWindow is cleaned with special glass cleaner");
    }
    @Override
    public void resize(){
        System.out.println("GlassWindow size adjusted precisely");
    }
}
