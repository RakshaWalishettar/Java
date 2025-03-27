package Parameter.instance.com;
import java.awt.*;


public class Brush {
    Colour color;

    Brush(Colour color) {
        this.color = color;
    }

    void clean() {
        System.out.println("Running Clean Method in Brush");
    }

    void scrub() {
        System.out.println("Running Scrub Method in Brush");
    }
}

