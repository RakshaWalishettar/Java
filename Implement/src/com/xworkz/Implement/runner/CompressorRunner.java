package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.CompressionTool;
import com.xworkz.Implement.internal.Compressor;
import com.xworkz.Implement.internal.ZipCompressor;

public class CompressorRunner {
    public static void main(String[] args) {
        Compressor compressor = new ZipCompressor();
        CompressionTool tool = new CompressionTool(compressor);
        tool.execute();
    }
}
