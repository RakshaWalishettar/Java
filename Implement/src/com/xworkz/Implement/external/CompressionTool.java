package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Compressor;

public class CompressionTool {
    private Compressor compressor;

    public CompressionTool(Compressor compressor) {
        this.compressor = compressor;
        System.out.println("CompressionTool initialized");
    }

    public void execute() {
        System.out.println("Starting compression...");
        if (this.compressor != null) {
            this.compressor.compress();
        }
        else {
            System.out.println("not stated compression");
        }
    }
}
