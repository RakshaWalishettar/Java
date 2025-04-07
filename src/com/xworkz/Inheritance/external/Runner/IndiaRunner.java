package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Country;
import com.xworks.Inheritance.external.Culture;
import com.xworks.Inheritance.external.India;

public class IndiaRunner {
    public static void main(String[] args) {
        India india = new India();
        india.nationalSport();
        india.nationalLanguage();
        india.nationalFlag();
        india.nationalAnthem();
        india.nationalAnimal();

        System.out.println("==============================");
        Country country1 = new Country();
        country1.nationalAnimal();
        country1.nationalAnthem();
        country1.nationalFlag();
        country1.nationalLanguage();
        country1.nationalSport();

        System.out.println("===========================");

        Culture culture=new Culture();
        culture.varityoffood(culture);
        culture.varityoffood(country1);
    }
}
