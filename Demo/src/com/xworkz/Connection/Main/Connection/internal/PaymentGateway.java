package com.xworkz.Connection.Main.Connection.internal;

public interface PaymentGateway {
    void authenticate();
    void pay();
    void logout();
}
