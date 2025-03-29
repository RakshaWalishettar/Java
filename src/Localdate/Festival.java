package Localdate;

import java.time.LocalDate;

public class Festival {
    private String name;
    private LocalDate localDate;

    // Constructor
    public Festival(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    // Display festival details
    public void displayFestivalDetails() {
        System.out.println("The name of the festival: " + name);
        System.out.println("The date of the festival: " + localDate);
    }
}
