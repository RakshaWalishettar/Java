package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Verifier;

public class VerifierUser {
    private Verifier verifier;
    public VerifierUser(Verifier verifier) {
        this.verifier = verifier;
        System.out.println("VerifierUser initialized");
    }
    public void execute() {
        System.out.println("Verifying data...");
        if (this.verifier != null) {
            this.verifier.verify();
        } else {
            System.out.println("not verified");
        }
    }

}
