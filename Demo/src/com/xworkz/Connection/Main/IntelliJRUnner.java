package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.IntelliJ;
import com.xworkz.Connection.internal.IDE;

public class IntelliJRUnner {
    public static void main(String[] args) {
        IDE ide = new IntelliJ();
        ide.writeCode();
        ide.debug();
        ide.buildProject();
    }
}
