package org.example;

import java.util.Scanner;

public enum ProgramOptions {
    PROVIDE_PRODUCTION_DATE_RANGE(1),
    PRINT_DATA_OF_RANDOM_MOVIE(2),
    PROVIDE_ACTOR_FULL_NAME(3);

    private final int value;

    ProgramOptions(final int value) {
        this.value = value;
    }

    public static ProgramOptions fromInteger(int number) {
        for (ProgramOptions option : ProgramOptions.values()) {
            if (option.value == number) {
                return option;
            }
        }
        return null;
    }

    public static ProgramOptions getOptionFromUser(){
        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
        return ProgramOptions.fromInteger(selectedOption);
    }

    public static int getDateFromUser(){
        Scanner scanner = new Scanner(System.in);
        int date = scanner.nextInt();
        return date;
    }

    public static int getStartDateFromUser(){
        System.out.print("Od roku: ");
        return getDateFromUser();
    }

    public static int getEndDateFromUser(){
        System.out.print("Do roku: ");
        return getDateFromUser();
    }

    public static String getStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        return firstName;
    }

    public static String getFirstName(){
        System.out.print("Podaj imię aktora: ");
        return getStringFromUser();
    }

    public static String getLastName(){
        System.out.print("Podaj nazwisko aktora: ");
        return getStringFromUser();
    }
}