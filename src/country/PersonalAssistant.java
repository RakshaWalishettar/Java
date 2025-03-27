package com.xworkz.country;


class PersonalAssistant {
    String name;
    int age;
    String qualification;
    String role;

    public PersonalAssistant(String name, int age, String qualification, String role) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.role = role;
    }

    public void display() {
        System.out.println("      Personal Assistant: " + name + " | Age: " + age + " | Qualification: " + qualification + " | Role: " + role);
    }
}