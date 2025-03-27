package com.xworkz.country;
import java.util.List;


public class Experience {
    List<ExperienceDetails> details;

    public Experience(List<ExperienceDetails> details) {
        this.details = details;
    }

    public void display() {
        for (ExperienceDetails detail : details) {
            detail.display();
        }
    }
}