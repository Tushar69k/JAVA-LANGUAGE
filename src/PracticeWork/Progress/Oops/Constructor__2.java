package PracticeWork.Progress.Oops;

import java.util.*;

import static PracticeWork.Progress.Oops.Constructor__2.tush;

public class Constructor__2 {
    static Scanner tush = new Scanner(System.in);

    public static void main(String[] args) {

        Movies m1 = new Movies();
        m1.ShowDetails();

    }
}


class Movies {
    //            Scanner Sc = new Scanner(System.in);
    String name;
    int releaseYear;
    int budget;
    float imdb;

    Movies() {
        System.out.print("Enter Movie Name : ");
        name = tush.next();
        System.out.print("Enter Release Year : ");
        releaseYear = tush.nextInt();
        System.out.print("Enter Movie Budget (in cr) : ");
        budget = tush.nextInt();
        System.out.print("Enter Movie's IMDB Rating : ");
        imdb = tush.nextFloat();

        System.out.println("\nDetails Entered Successfully ! ");
    }

    void ShowDetails() {
        System.out.println("Showing Movie's Details ...");
        System.out.println("Movie Name : " + name);
        System.out.println("Release Year : " + releaseYear);
        System.out.println("Movie Budget : " + budget + " Cr");
        System.out.println("Movie's IMDB Rating : " + imdb);
    }
}