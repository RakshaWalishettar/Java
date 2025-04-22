package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Uploader;

public class UploadService {
    private Uploader uploader;
    public UploadService(Uploader uploader) {
        this.uploader = uploader;
        System.out.println("UploadService initialized");
    }
    public void execute() {
        System.out.println("Starting upload...");
        if (this.uploader != null) {
            this.uploader.upload();
        } else {
            System.out.println("not uploaded");
        }
    }
}
