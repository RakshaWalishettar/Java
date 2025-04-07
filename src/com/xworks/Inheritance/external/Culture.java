package com.xworks.Inheritance.external;

public class Culture extends Country{
    public void religious(){
        System.out.println("the varity of religious and culture");
    }
    public void varityoffood(Country country){
        country.nationalSport();
        country.nationalFlag();
        country.nationalLanguage();
        country.nationalAnthem();
        country.nationalAnimal();

        if(country instanceof Culture){
            Culture culture=(Culture) country;
            System.out.println("the instance of the culture is country");
            culture.religious();
        }
    }
}
