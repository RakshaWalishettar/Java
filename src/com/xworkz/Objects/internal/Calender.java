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
    public String toString() {
        return "Calendar [year=" + year + ", format=" + format + ", pages=" + pages + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 23;
    }
}
