package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Renderer;

public class RenderService {
    private Renderer renderer;
    public RenderService(Renderer renderer) {
        this.renderer = renderer;
        System.out.println("RenderService initialized");
    }
    public void execute() {
        System.out.println("Rendering content...");
        if (this.renderer != null) {
            this.renderer.render();
        } else {
            System.out.println("no content");
        }
    }
}
