package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Renderer2D;

public class DrawingService {
    private Renderer2D renderer;
    public DrawingService(Renderer2D renderer) {
        this.renderer = renderer;
        System.out.println("DrawingService initialized");
    }
    public void execute() {
        System.out.println("Executing draw...");
        if (this.renderer != null) {
            this.renderer.draw();
        } else {
            System.out.println("not executed");
        }
    }
}
