package Assign.parameter.com;

public class ShopRunner {
    void ads(Display display) {
        if (display != null) {
            System.out.println("Ads running in Shop");
            display.run();
        } else {
            System.out.println("No display available to run ads.");
        }
    }
}
