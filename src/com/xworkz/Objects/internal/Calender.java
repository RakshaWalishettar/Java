package com.xworkz.Objects.internal;

public class Calender {
    private String year;
    private char format;
    private int pages;

    public Calender(String year, char format, int pages) {
        this.year = year;
        this.format = format;
        this.pages = pages;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Calender) {
                System.out.println("Object is an instance of calender");
                Calender other = (Calender) obj;
                if (this.year.equals(other.year)) {
                    System.out.println("Both calender are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Calendar [year=" + year + ", format=" + format + ", pages=" + pages + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 23;
    }
}
