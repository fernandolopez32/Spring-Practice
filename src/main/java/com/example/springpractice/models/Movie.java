package com.example.springpractice.models;

public class Movie {
//    variables
    private String title;

    private String genre;



// constructors

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
//    setters and getters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
