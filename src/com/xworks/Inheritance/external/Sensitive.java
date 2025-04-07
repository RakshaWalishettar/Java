package com.xworks.Inheritance.external;

public class Sensitive extends Window{
    public void shape(){
        System.out.println("the window has shape");
    }
    public void broke(Window window){
        window.lock();
        window.clean();
        window.close();
        window.open();
        window.resize();

        if(window instanceof Sensitive){
            Sensitive sensitive=(Sensitive) window;
            System.out.println("the sensitive is the instance of window");
            sensitive.shape();
        }
    }
}
