package Assign.parameter.com;

public class Thearter {
    void show(Poster poster) {
        if (poster != null) {
            System.out.println("Movies presented in Theater");
            poster.showInfo();
        } else {
            System.out.println("No movies.");
        }
    }
}
