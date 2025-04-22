package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Encryptor;

public class EncryptionService {
    private Encryptor encryptor;
    public EncryptionService(Encryptor encryptor) {
        this.encryptor = encryptor;
        System.out.println("EncryptionService initialized");
    }
    public void execute() {
        System.out.println("Encrypting data...");
        if (this.encryptor != encryptor) {
            this.encryptor.encrypt();
        } else {
            System.out.println("no data encryption");
        }
    }
}
