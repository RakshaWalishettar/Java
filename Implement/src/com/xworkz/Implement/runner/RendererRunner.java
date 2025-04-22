package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.RenderService;
import com.xworkz.Implement.internal.HtmlRenderer;
import com.xworkz.Implement.internal.Renderer;

public class RendererRunner {
    public static void main(String[] args) {
        Renderer renderer = new HtmlRenderer();
        RenderService service = new RenderService(renderer);
        service.execute();
    }
}
