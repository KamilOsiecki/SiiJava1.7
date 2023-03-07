package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String genre;
    private int date;
    private Director director;
    private ArrayList<Actor> actors;

    public Movie(@JsonProperty("title") String title,
                 @JsonProperty("genre") String genre,
                 @JsonProperty("date") int date,
                 @JsonProperty("director") Director director,
                 @JsonProperty("actors") ArrayList<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.director = director;
        this.actors = actors;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Title: " + this.title +
                "\nDirector: " + this.director +
                "\nGenre: " + this.genre +
                "\nDate: " + this.date +
                "\nActors: " + this.actors + "\n\n";
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }
}