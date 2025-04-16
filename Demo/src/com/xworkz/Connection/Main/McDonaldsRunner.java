package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.McDonalds;
import com.xworkz.Connection.internal.Restaurant;

public class McDonaldsRunner {
    public static void main(String[] args) {
        Restaurant r = new McDonalds();
        r.takeOrder();
        r.prepareFood();
        r.serveFood();
    }
}
