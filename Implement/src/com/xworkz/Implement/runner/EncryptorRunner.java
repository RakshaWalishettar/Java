package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.EncryptionService;
import com.xworkz.Implement.internal.AESEncryptor;
import com.xworkz.Implement.internal.Encryptor;

public class EncryptorRunner {
    public static void main(String[] args) {
        Encryptor encryptor = new AESEncryptor();
        EncryptionService service = new EncryptionService(encryptor);
    }
}
