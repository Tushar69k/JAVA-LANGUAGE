package PracticeWork;
/*
WRITE A JAVA PROGRAM WHICH ASKS USER TO ENTER HIS/HER NAME AND GREET THEM WITH "HELLO <NAME> , HAVE A GOOD DAY " TEXT.
 */

import java.util.Scanner;

public class PQ_3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME PLEASE : ");
        String name = tush.nextLine();
        System.out.println("HELLO " + name + " , HAVE A GREAT DAY");

    }
}
