package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.DownloadService;
import com.xworkz.Implement.internal.Downloader;
import com.xworkz.Implement.internal.FileDownloader;

public class DownloaderRunner {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloader();
        DownloadService service = new DownloadService(downloader);
        service.execute();
        downloader.download();
    }
}
