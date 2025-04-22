package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Downloader;

public class DownloadService {
    private Downloader downloader;
    public DownloadService(Downloader downloader) {
        this.downloader = downloader;
        System.out.println("DownloadService initialized");
    }
    public void execute() {
        System.out.println("Starting download...");
        if(this.downloader!=null){
            this.downloader.download();
        }
    }
}
