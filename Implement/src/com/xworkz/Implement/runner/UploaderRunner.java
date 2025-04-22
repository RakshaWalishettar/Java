package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.UploadService;
import com.xworkz.Implement.internal.ImageUploader;
import com.xworkz.Implement.internal.Uploader;

public class UploaderRunner {
    public static void main(String[] args) {
        Uploader uploader = new ImageUploader();
        UploadService service = new UploadService(uploader);
        service.execute();
    }
}
