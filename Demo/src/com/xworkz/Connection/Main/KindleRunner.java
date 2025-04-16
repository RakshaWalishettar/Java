package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Kindle;
import com.xworkz.Connection.internal.EBookReader;

public class KindleRunner {
    public static void main(String[] args) {
        EBookReader reader = new Kindle();
        reader.openBook();
        reader.nextPage();
        reader.closeBook();
    }
}
