package com.xworkz.country;

class Portfolio {
    String name;
    String responsibility;
    int budget;
    Details detail;

    public Portfolio(String name, String responsibility, int budget, Details detail) {
        this.name = name;
        this.responsibility = responsibility;
        this.budget = budget;
        this.detail = detail;
    }

    public void display() {
        System.out.println(" Portfolio: " + name + " | Responsibility: " + responsibility + " | Budget: $" + budget);
        detail.display();
    }
}