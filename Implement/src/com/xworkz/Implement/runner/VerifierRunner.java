package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.VerifierUser;
import com.xworkz.Implement.internal.EmailVerifier;
import com.xworkz.Implement.internal.Verifier;

public class VerifierRunner {
    public static void main(String[] args) {
        Verifier verifier = new EmailVerifier();
        VerifierUser user = new VerifierUser(verifier);
        user.execute();
    }
}
