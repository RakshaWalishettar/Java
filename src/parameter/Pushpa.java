package Parameter.instance.com;
import java.sql.SQLOutput;
public class Pushpa {
    void Movie(Clip[] clips) {
        if (clips != null) {
            System.out.println("using clip ----> Pushpa");
            for (Clip clip : clips) {
                clip.hold();
                System.out.println("List of Clips : " + clip.color);
            }
        } else {
            System.err.println("Clip is null");
        }
    }
}
