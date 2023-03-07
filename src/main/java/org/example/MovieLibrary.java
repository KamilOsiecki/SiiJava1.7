package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Random;

public class MovieLibrary extends Movie {

    @JsonProperty("movies")
    private ArrayList<Movie> movies;

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public MovieLibrary() {
        super();
    }

    public void moviesProductionDateRange(int dateFrom, int dateTo) {
        movies.stream()
                .filter(m -> m.getDate() >= dateFrom)
                .filter(m -> m.getDate() <= dateTo)
                .map((m -> m.getTitle() + " " + m.getDate()))
                .forEach(System.out::println);
    }

    public void randomMovie() {
        int movie = new Random().nextInt(movies.size());
        System.out.println(movies.get(movie));
    }

    public void allMoviesOfActor(String firstName, String lastName) {
        movies.stream()
                .filter(m -> m.getActors().stream().anyMatch(a -> a.getLastName().equals(lastName)))
                .filter(m -> m.getActors().stream().anyMatch(a -> a.getFirstName().equals(firstName)))
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}