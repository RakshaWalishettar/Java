package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.EncoderUser;
import com.xworkz.Implement.internal.Base64Encoder;
import com.xworkz.Implement.internal.Encoder;

public class EncoderRunner {
    public static void main(String[] args) {
        Encoder encoder = new Base64Encoder();
        EncoderUser user = new EncoderUser(encoder);
        user.execute();
    }
}
