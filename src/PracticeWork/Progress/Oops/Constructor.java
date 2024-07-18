package PracticeWork.Progress.Oops;

import java.util.*;

public class Constructor {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        Movie m1 = new Movie("JAWAN", 2024, 8.5F, 300);
        System.out.println(m1.name);
        System.out.println(m1.year);
        System.out.println(m1.imdb);
        System.out.println(m1.budget);
    }
}


class Movie {
    String name;
    int year;
    float imdb;
    int budget;

    Movie(String name, int year, float imdb, int budget) {
        this.name = name;
        this.year = year;
        this.imdb = imdb;
        this.budget = budget;
    }
}
