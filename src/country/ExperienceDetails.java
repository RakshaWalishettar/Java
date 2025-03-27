package com.xworkz.country;

public class ExperienceDetails {
    String company;
    String education;

    public ExperienceDetails(String company, String education) {
        this.company = company;
        this.education = education;
    }

    public void display() {
        System.out.println("            ExperienceDetail - Company: " + this.company + " | Education: " + this.education);
    }
}
