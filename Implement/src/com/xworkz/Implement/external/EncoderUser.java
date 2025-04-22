package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Encoder;

public class EncoderUser {
    private Encoder encoder;
    public EncoderUser(Encoder encoder) {
        this.encoder = encoder;
        System.out.println("EncoderUser initialized");
    }
    public void execute() {
        System.out.println("Encoding data...");
        if (this.encoder != null) {
            this.encoder.encode();
        } else {
            System.out.println("decoded");
        }
    }

    }
