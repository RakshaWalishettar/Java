package com.xworkz.Objects.internal;

public class Movie {
    private String title;
    private char genre;
    private int duration;

    public Movie(String title, char genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", genre=" + genre + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -39;
    }
}
