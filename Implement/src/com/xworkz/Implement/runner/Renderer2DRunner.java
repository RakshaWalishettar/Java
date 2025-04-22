package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.DrawingService;
import com.xworkz.Implement.internal.CircleRenderer;
import com.xworkz.Implement.internal.Renderer2D;

public class Renderer2DRunner {
    public static void main(String[] args) {
        Renderer2D renderer = new CircleRenderer();
        DrawingService service = new DrawingService(renderer);
        service.execute();
    }
}
