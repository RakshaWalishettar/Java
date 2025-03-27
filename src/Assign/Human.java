package Assign.parameter.com;

public class Human {
    void fever(Dolo650 dolo650) {
        if (dolo650 != null) {
            dolo650.cause();
            System.out.println("Taking Dolo650 for fever.");
        } else {
            System.out.println("No medicine available for fever.");
        }
    }

    void longHair(Barber barber) {
        if (barber != null) {
            barber.cutHair();
            System.out.println("Cutting long hair.");
        } else {
            System.out.println("No barber available for haircut.");
        }
    }

    void Bill(Barber barber) {
        if (barber != null) {
            barber.Bill();
            System.out.println("takes amount.");
        } else {
            System.out.println("barber shop is close .");
        }
    }

    void photo(Camera camera) {
        if (camera != null) {
            camera.photo();
            System.out.println("Clicking photo of human.");
        } else {
            System.out.println("No camera available for taking photos.");
        }
    }
    void record(Camera camera) {
        if (camera != null) {
            camera.video();
            System.out.println("Clicking photo of human.");
        } else {
            System.out.println("No camera available for taking photos.");
        }
    }

    void eat(Mango mango) {
        if (mango != null) {
            mango.season();
            System.out.println("Summer is the mango season.");
        } else {
            System.out.println("No mango available to eat.");
        }
    }

    void sleepy(Pillow pillow) {
        if (pillow != null) {
            pillow.sleep();
            System.out.println("Human sleeping on pillow.");
        } else {
            System.out.println("No pillow available for sleeping.");
        }
    }
}
