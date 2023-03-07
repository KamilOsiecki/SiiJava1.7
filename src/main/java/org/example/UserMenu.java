package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class UserMenu {

    public static void programOptionsMenu() throws IOException {
        MovieLibrary movieLibrary = new ObjectMapper().readValue(new File("src/main/resources/movies.json"), MovieLibrary.class);

        switch (ProgramOptions.getOptionFromUser()) {
            case PROVIDE_PRODUCTION_DATE_RANGE ->
                    movieLibrary.moviesProductionDateRange(ProgramOptions.getStartDateFromUser(), ProgramOptions.getEndDateFromUser());
            case PRINT_DATA_OF_RANDOM_MOVIE -> movieLibrary.randomMovie();
            case PROVIDE_ACTOR_FULL_NAME ->
                    movieLibrary.allMoviesOfActor(ProgramOptions.getFirstName(), ProgramOptions.getLastName());
            default -> printErrorMessage();
        }
    }

    public static void printOptions() {
        System.out.println("""
                Witaj! Wybierz jedną z opcji:
                                
                1.Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami
                2.Wyświetl wszystkie informacje o losowym filmie
                3.Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał""");
    }

    public static void printErrorMessage() {
        System.out.println("Incorrect data input. Please select one of three options.");
    }
}