package Localdate;
import java.time.LocalDate;

public class FestivalRunner {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        Festival festival = new Festival("udagi", LocalDate.now());
        festival.displayFestivalDetails();
    }
}




