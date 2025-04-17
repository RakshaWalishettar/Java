package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Router;
import com.xworkz.Connection.internal.NetworkDevice;

public class RouterRunner {
    public static void main(String[] args) {
        NetworkDevice router = new Router();
        router.connect();
        router.sendData();
        router.disconnect();
        router.recive();
    }
}
