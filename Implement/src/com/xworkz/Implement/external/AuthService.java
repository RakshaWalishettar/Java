package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Authenticator;

public class AuthService {
    private Authenticator authenticator;

    public AuthService(
            Authenticator authenticator) {
        this.authenticator = authenticator;
        System.out.println("AuthService initialized");
    }

    public void execute() {
        System.out.println("Authenticating user...");
        if (this.authenticator != null) {
            this.authenticator.aunthentication();
        }
    }
}
