package PracticeWork;

import java.util.Scanner;

/*
WRITE A JAVA PROGRAM TO DETECT WHETHER A NUMBER ENTERED BY THE USER IS INTEGER OR NOT .
 */
public class PQ_5 {

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHICH WAS CHECKED THAT IT IS INTEGER OR NOT : ");
        System.out.println(tush.hasNextInt());

    }
}
