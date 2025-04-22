package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.AuthService;
import com.xworkz.Implement.internal.Authenticator;
import com.xworkz.Implement.internal.TokenAuthenticator;

public class AuthRunner {
    public static void main(String[] args) {
        Authenticator authenticator = new TokenAuthenticator();
        AuthService service = new AuthService(authenticator);
        service.execute();
    }
}
